package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {
			new OgretmenKrediManager(), new OgrenciKrediManager(), new TarimKrediManager()
		};
		
		for (BaseKrediManager krediManager : krediManagers) {
			System.err.println(krediManager.hesapla(1000));
		}
	}

}
