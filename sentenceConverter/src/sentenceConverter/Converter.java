package sentenceConverter;

public class Converter {
	StringBuilder sb = new StringBuilder() ;
	String  s;
	
	public Converter(String s) {
		
		this.sb = sb.append(s);
		Character c = new Character();
		c.setCharacter(sb);
	    
	    sb = c.getUpperCharacter();
	    for(int i=1;i<sb.length(); i++){
			
			if(sb.charAt(i) == '0' && sb.charAt(i+1) == ' ' && sb.charAt(i-1) == ' '){
				
				sb.replace(i, i+1, "zero" );
			}
			else if (sb.charAt(i) == '1'&& sb.charAt(i+1) == ' '&& sb.charAt(i-1) == ' '){
				
					sb.replace(i, i+1, "one" );
			}
			else if (sb.charAt(i) == '2'&& sb.charAt(i+1) == ' '&& sb.charAt(i-1) == ' '){
				
					sb.replace(i, i+1, "two" );
			}
			else if (sb.charAt(i) == '3'&& sb.charAt(i+1) == ' '&& sb.charAt(i-1) == ' '){
				
					sb.replace(i, i+1, "three" );
			}
			else if (sb.charAt(i) == '4'&& sb.charAt(i+1) == ' '&& sb.charAt(i-1) == ' '){
				
					sb.replace(i, i+1, "four" );
				}
			else if (sb.charAt(i) == '5'&& sb.charAt(i+1) == ' '&& sb.charAt(i-1) == ' '){
				
				sb.replace(i, i+1, "five" );
				}
			else if (sb.charAt(i) == '6'&& sb.charAt(i+1) == ' '&& sb.charAt(i-1) == ' '){
				
					sb.replace(i, i+1, "six" );
			}
			else if (sb.charAt(i) == '7'&& sb.charAt(i+1) == ' '&& sb.charAt(i-1) == ' '){
				
					sb.replace(i, i+1, "seven" );
			}
			else if (sb.charAt(i) == '8'&& sb.charAt(i+1) == ' '&& sb.charAt(i-1) == ' '){
				
					sb.replace(i, i+1, "eight" );
			}
			else if (sb.charAt(i) == '9'&& sb.charAt(i+1) == ' '&& sb.charAt(i-1) == ' '){
				
					sb.replace(i, i+1, "nine" );
				}
			
		}
	}
	
	public String getConverted() {
		s = sb.toString();
		return s;
	}
	
	
	
	
	
}
