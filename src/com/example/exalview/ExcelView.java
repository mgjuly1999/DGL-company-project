package com.example.exalview;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.example.models.Store;


@Component("storeExcelView")
public class ExcelView extends AbstractXlsxView{

	@Override
	protected void buildExcelDocument(
			Map<String, Object> model, 
			Workbook workbook, 
			HttpServletRequest res,
			HttpServletResponse resp) throws Exception {
		
		List<Store> l=(List<Store>)model.get("storeList");
		
		Sheet sheet=workbook.createSheet("Tile");
		
		int row=0;
		Row header=sheet.createRow(row);
		header.createCell(0).setCellValue("No#");
		header.createCell(1).setCellValue("Store-Id");
		header.createCell(2).setCellValue("Customer");
		header.createCell(3).setCellValue("Total Litter");
		header.createCell(4).setCellValue("Total Pound");
		header.createCell(5).setCellValue("Water Litter");
		header.createCell(6).setCellValue("DRC");
		header.createCell(7).setCellValue("Dry Pound");
		header.createCell(8).setCellValue("Create Date");
		
		
		row++;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		for(Store store:l){
			Row r=sheet.createRow(row++);
			r.createCell(0).setCellValue(row);
			r.createCell(1).setCellValue(store.getStoreId());
			r.createCell(2).setCellValue(store.getCustomer().getName());
			r.createCell(3).setCellValue(store.getTotalLitter());
			r.createCell(4).setCellValue(store.getTotalPound());
			r.createCell(5).setCellValue(store.getWaterLitter());
			r.createCell(6).setCellValue(store.getDrc());
			r.createCell(7).setCellValue(store.getDryPound());
			r.createCell(8).setCellValue(sdf.format(store.getCustomer().getCreateDate()));
		
		}
	
		resp.setHeader("Content-Disposition",
				"attachment; filename=Store All Informations.xlsx"
				);
	}
}




