package criptoBean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CriptoBean {
	private String mensOrigem;
	private String mensCripto;
	

	
	public String getMensOrigem() {
		return mensOrigem;
	}
	public String getMensCripto() {
		return mensCripto;
	}
	public void setMensOrigem(String mensOrigem) {
		this.mensOrigem = mensOrigem;
	}
	public void setMensCripto(String mensCripto) {
		this.mensCripto = mensCripto;
	}
	
	public void cifraFrase(){
		
		String textoCifrado= this.getMensOrigem();
			
		char [] texto = textoCifrado.toCharArray();
		textoCifrado="";
		for(int i = 0; i < texto.length;i++){
			char a = texto[i];
			int b = a+3; 
			String aChar = new Character((char)b).toString();
			textoCifrado+=aChar;
		}
		this.setMensCripto(textoCifrado);				
			
	}
	

}
