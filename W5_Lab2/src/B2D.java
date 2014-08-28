import java.util.*;
public class B2D {

	public static int Bin2Dec (String binIn)
	{
		
		final Exception binaryFormatExecption(){}
		int dec = 0;
		int binvalue = 1;
		char[] binParse = new char[]{};
		binParse = binIn.toCharArray();
		if (binParse.length>8){throw new binaryFormatExecption}
		for (int i=binParse.length-1; i>=0;i--)
		{
			if (binParse[i]=='1')
			{
				dec+=binvalue;
				binvalue *= 2;						
			}
			else
			{
				binvalue *= 2;
			}
		}
		binvalue =1;
		
		
		
		
		return dec;
	}
	
}
