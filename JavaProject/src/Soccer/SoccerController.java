package Soccer;

import java.util.HashMap;

public class SoccerController {
	HashMap map = new HashMap();
	
	public boolean Membership(String id, Member m) {
		if(map.get(id) == null) {
			map.put(id, m);
			return true;
		}
		return false;
	}
	
	public String login(String id, String pw) {
		Member m = (Member)map.get(id);
		if(m != null) {
			if(m.getPw().equals(pw)) {
				return m.getName();
			}
		}
		
		return null;
	}
	
	
	
	
}