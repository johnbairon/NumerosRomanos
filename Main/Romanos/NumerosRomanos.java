package Romanos;

public class NumerosRomanos{

	public String convertir(int numero){
		String resultado="";
		String romanos[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int decimales[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i=0;i<romanos.length;i++){
			while(numero>=decimales[i]){
				resultado+=romanos[i];
				numero-=decimales[i];
			}
		}
		return resultado;
	}
}

