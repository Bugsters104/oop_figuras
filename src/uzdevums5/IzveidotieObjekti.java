package uzdevums5;

import java.util.ArrayList;

public class IzveidotieObjekti {
	static String izvaditCentru(ArrayList<Centrs> centruSaraksts) {
		String str = "";
		for (int i=0; i<centruSaraksts.size(); i++) {
			str += 
			i+". objekts "+centruSaraksts.get(i).izvaditKoordinatas()+"\n";
		}
		
		return str;
	}
	
	static String izvaditCetrsturi(ArrayList<Cetrsturis> cetrsturuSaraksts) {
		String str = "";
		for (int i=0; i<cetrsturuSaraksts.size(); i++) {
			str += 
			i+". objekts "+cetrsturuSaraksts.get(i).izvaditCetrsturaInfo()+"\n";
		}
		
		return str;
	}
}
