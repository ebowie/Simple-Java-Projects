package sentenceConverter;

public class Character {
	StringBuilder upperChar = new StringBuilder(); 
	
	public void setCharacter (StringBuilder sb){
		
		
		
		int j = 0;

			if(sb.charAt(j) == '0' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "Zero" );
			}
			else if(sb.charAt(j) == '1' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "One" );
			}
			else if(sb.charAt(j) == '2' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "Two" );
			}
			else if(sb.charAt(j) == '3' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "Three" );
			}
			else if(sb.charAt(j) == '4' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "Four" );
			}
			else if(sb.charAt(j) == '5' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "Five" );
			}
			else if(sb.charAt(j) == '6' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "Zero" );
			}
			else if(sb.charAt(j) == '7' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "Seven" );
			}
			else if(sb.charAt(j) == '8' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "Eight" );
			}
			else if(sb.charAt(j) == '9' && sb.charAt(j+1) == ' '){
				sb.replace(j, j+1, "Nine" );
			}

				upperChar = sb;
		

	}
	public StringBuilder getUpperCharacter(){
		return upperChar;
	}
		
}
