package com.tejas.barcodeProvider;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import org.krysalis.barcode4j.impl.upcean.EAN13Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

import net.glxn.qrgen.javase.QRCode;

public class BarcodeGenerator {

	public static BufferedImage generateEAN13BarcodeImage(String barcodeText) {
		EAN13Bean barcodeGenerator = new EAN13Bean();
		BitmapCanvasProvider canvas = new BitmapCanvasProvider(160, BufferedImage.TYPE_BYTE_BINARY, false, 0);

		barcodeGenerator.generateBarcode(canvas, barcodeText);
		return canvas.getBufferedImage();
	}
	
	public static void generateQRCodeImage(String barcodeText, String filename) throws Exception {
		File fil = new File(filename);
		if(fil.exists())
		{
			fil.delete();
		}
		ByteArrayOutputStream outputStream = QRCode.from(barcodeText).withSize(400, 400).stream();
		OutputStream output = new FileOutputStream(new File(filename));
		outputStream.writeTo(output);
		if(fil.exists())
		{
			System.out.println("The file = "+filename+" containing the qr code is created ");
		}
	}

	public static void main(String[] args) {
		BufferedImage image = BarcodeGenerator.generateEAN13BarcodeImage("123456888888");
		System.out.println("image value = " + image);
		try {
			File a = new File("test.jpg");
			ImageIO.write(image, "jpg", a);
			BarcodeGenerator.generateQRCodeImage("We are working on a project 123456 5677- Q", "Qr.jpg");
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
