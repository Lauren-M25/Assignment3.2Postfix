/********************************************************************
 * Programmer:  sveinson
 * Class:  CS20S
 *
 * Assignment: A3.2 Postfix
 *
 * Description: Solves postfix equations using stack
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.tetokens[i]t.DecimalFormat;
 import java.io.*;

public class ClientTemplate {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;       // string data input from keyboard
        String strout;      // processed info string to be output
        String bannerOut;       // string to print banner to message dialogs

        String prompt;      // prompt for use in input dialogs

        String delim = "[ ]+"; // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
    // ***** create objects *******
    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        //ProgramInfo programInfo = new ProgramInfo("assignment name");
        
        BufferedReader fin = new BufferedReader(new FileReader("PostfixData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.ttokens[i]t")));
        
    // ********** Print output Banner **********

        //System.out.println(programInfo.getBanner("A1Q2"));
        //fout.println(programInfo.getBanner("A1Q2"));

        //System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());
            
    // ************************ get input **********************

        strin = fin.readLine();
        
        System.out.println(strin);
        
        tokens = strin.split(delim);
        
        System.out.println(tokens[3]);
        
        if((String)tokens[3] == "+"){
            System.out.println("true");
        }
    
    // ************************ processing ***************************
        
        /*while(strin != null){
            Stack s = new Stack();
            Node n = new Node(0);
        
            tokens = strin.split(delim);
        
            for(int i = 0; i < tokens.length; i++){
        
                if((String) tokens[i] == "+" || (String) tokens[i] == "*" || (String) tokens[i] == "-" || (String) tokens[i] == "/"){
                    if((String) tokens[i] == "+"){              
                        int op2 = (int) s.pop();
                        int op1 = (int) s.pop();
                        n = new Node(op1 + op2);
                        s.push(n);
                    } else {
                        if((String) tokens[i] == "-"){
                            int op2 = (int) s.pop();
                            int op1 = (int) s.pop();
                            n = new Node(op1 - op2);
                            s.push(n);
                        } else {
                            if((String) tokens[i] == "*"){
                                int op2 = (int) s.pop();
                                int op1 = (int) s.pop();
                                n = new Node(op1 * op2);
                                s.push(n);
                            } else {
                                int op2 = (int) s.pop();
                                int op1 = (int) s.pop();
                                n = new Node(op1 / op2);
                                s.push(n);
                            }
                        } 
                    }
                } else {
                    n = new Node(Integer.parseInt(tokens[i]));
                    System.out.println(tokens[i]);
                    s.push(n);
                }
                
            }
            System.out.println(strin + " = " + s.pop());
            strin = fin.readLine();
        }*/
    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        //System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
