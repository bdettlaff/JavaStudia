import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Vector {
	
	protected List<Integer> lista = new ArrayList<Integer>();
	protected boolean czyZly = false;
	
	public void dodajDane() {
			Scanner pobierz = new Scanner(System.in);
	
			String linia = pobierz.nextLine();
			Scanner skanLinii = new Scanner(linia);
			
			try {
				int liczba = skanLinii.nextInt();
				this.lista.add(liczba);
			
				while(skanLinii.hasNextInt()) {
					
					try {
					    liczba = skanLinii.nextInt();
						this.lista.add(liczba);
					}
					catch(InputMismatchException e) {
						System.out.println("Nie wprowadziles liczby.");
					}
				}
			}catch(InputMismatchException e) {
				System.out.println("Nie wprowadziles liczby.");
				this.czyZly=true;
			}
	}
	
	public void wypiszDane() {
		
		for(int i=0;i<this.lista.size();i++) {
			if(this.lista.size()==1)
			{
				System.out.print("[");
				System.out.print(this.lista.get(i));
				System.out.print("]\n");
			}
			else if(i==0) {
				System.out.print("[");
				System.out.print(this.lista.get(i));
				System.out.print(",");
			}
			else if(i==(this.lista.size()-1)) {
				System.out.print(this.lista.get(i));
				System.out.print("]\n");
			}
			else {
				System.out.print(this.lista.get(i));
				System.out.print(",");
			}
		}
	}
	
	public List<Integer> zwrocVector() {
		return this.lista;
	}
	
	public void dodajVectory(Vector wektor, List<Integer> pierwszyWektor, List<Integer> drugiWektor) {
		
		
		for(int i=0; i<pierwszyWektor.size(); i++) {
			wektor.lista.add(pierwszyWektor.get(i)+drugiWektor.get(i));
		}
	}
	
	public void czyUzytecznyWektor(Vector wektor) {
		if(this.czyZly==true) {
			for(int i=0;i<wektor.lista.size();i++) {
				this.lista.add(0);
			}
		}
	}
	
}
