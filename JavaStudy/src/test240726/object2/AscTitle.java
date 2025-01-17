package test240726.object2;

import java.util.Comparator;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// compareTo -> 나 자신과 비교해서 크면 1 아니면 -1 똑같으면 0
		if(o1.getTitle().compareTo(o2.getTitle()) == 0) {
		return o1.getTitle().compareTo(o2.getTitle());
		}
		return o1.getTitle().compareTo(o2.getTitle());
	}
}

