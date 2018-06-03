package br.com.usjt.exercicio2.item2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ArquivoPublicoParser implements ArquivoParser{

	@Override
	public void parse() {
		Writer writer = null;
		try {
			System.out.println("Imprimindo publico....");
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("C:\\USJT_CCP3AN\\publico.txt"), "utf-8"));
			writer.write("Estas informa��es s�o p�blicas. Todo mundo pode ver este arquivo.");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			 try {
				 writer.close();
			 } catch (Exception e) {
				 e.printStackTrace();
			 }
		}		
	}

}
