package PackUnpack;
import java.io.BufferedReader;
import java.io.File;
import java.util.List;
import java.util.stream.Stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Unpacker
{     
    public Unpacker(String src) throws Exception    
    {
        unpack(src);
    }

	public void unpack(String filePath)    
    {
        try
        {
            FileInputStream instream = new FileInputStream(filePath);  
            
            byte header[]= new byte[100];  
            int length = 0;
            
            while((length = instream.read(header,0,100)) > 0)  
            {
                String str = new String(header); 
                
                String ext = str.substring(str.lastIndexOf("\\"));  
                ext = ext.substring(1); 
                
                String[] words=ext.split("\\s"); 
                String filename = words[0]; 
                int size = Integer.parseInt(words[1]);  
                
                byte arr[] = new byte[size];   
                
                instream.read(arr,0,size);    

                System.out.println(filename);
                
                FileOutputStream fout=new FileOutputStream(filename);    
                fout.write(arr,0,size);   
            }
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
