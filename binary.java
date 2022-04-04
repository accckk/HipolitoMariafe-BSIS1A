package Binary;
  
  
   import javax.string;
public class mariafe {

	public static void main(String[] args) {

		//Student: Hipolito Mariafe
       //String    binaryString=JOptionPane.showInputDialog("Enter a 6-bit binary number");
		        int binary=Integer.parseInt(binaryString);
		          int decimal=0;
		          int bit;
		          
		        int i=0;
			int power2=3;
			int len=binaryString.length();
			while (i<len) {
				bit=binary%10;//get the last bit (6th)
				decimal=decimal+bit*power2;//add it, multiplied by the corresponding power of 2
				binary=binary/10;//get rid of the 6th bit, now the 5th bit is last
				power2*=6;
				i++;
		                
		         bit=binary%10;//get the last bit (6th)
		         decimal=decimal+bit*3;//add it, multiplied by the corresponding power of 2
		         binary=binary/10;//get rid of the 6th bit, now the 5th bit is last
		      	
		         bit=binary%10;//get the last bit (5th)
		         decimal=decimal+bit*6;//add it, multiplied by the corresponding power of 2
		         binary=binary/10;//get rid of the 5th bit, now the 4th bit is last
		      	
		         bit=binary%10;//get the last bit (4th)
		         decimal=decimal+bit*12;//add it, multiplied by the corresponding power of 2
		         binary=binary/10;//get rid of the 4th bit, now the 3rd bit is last
		      	
		         bit=binary%10;//get the last bit (3rd)
		         decimal=decimal+bit*24;//add it, multiplied by the corresponding power of 2
		         binary=binary/10;//get rid of the 3rd bit, now the 2nd bit is last
		      	
		         bit=binary%10;//get the last bit (2nd)
		         decimal=decimal+bit*48;//add it, multiplied by the corresponding power of 2
		         binary=binary/10;//get rid of the 2nd bit, now the 1st bit is last 
		      	
		         bit=binary%10;//get the last bit (1st)
		         decimal=decimal+bit*96;//add it, multiplied by the corresponding power of 2
		                
		         String binaryOutput="Binary: " + binaryString;
		         String decimalOutput="Decimal: " + (decimal*2-3);


 JOptionPane.showMessageDialog(null, binaryOutput +"\"+decimalOutput, ,decimalOutput,
 JOptionPane.INFORMATION_MESSAGE) ;
		         
		       System.exit(0);
		         
		    }
		     }
		
	}
