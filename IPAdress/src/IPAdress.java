//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//A defanged IP address replaces every period "." with "[.]".


public class IPAdress {

	public static void main(String[] args) {
		String address = "1.1.1.1";	
		System.out.println(defange(address));
	}

	public static String defange(String address) {
		int size = address.length();
		for(int i = 0; i < size; i++) {
			if(address.charAt(i) == '.') {
				address = address.substring(0, i) + "[.]" + address.substring(++i, size);
				size += 2;
			}
		}
		
		return address;
	}
	
}
