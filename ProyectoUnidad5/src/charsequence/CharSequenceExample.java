package charsequence;

public class CharSequenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			
			CharSequence [] arrayCharSeq = new CharSequence[3];
			
			arrayCharSeq[0]= "HolaString";
			
			arrayCharSeq[1]= new StringBuffer("HolaBuffer");
			
			arrayCharSeq[2]= new StringBuilder("HolaBuilder");
			
			
			
			for (CharSequence cs: arrayCharSeq ) {
				
				
				System.out.println( cs.subSequence(4, 9).toString() );
								
				
			}
		

	}

}
