/*
 * Estructuras de datos
 * Autores: 
    Jose Luis Gutierrez Espinosa-179888
    Andrés Navarrete-
    Andrés Quevedo-
    Bruno Vitte San Juan-179524
    
 */
package proyectocalculadora;

import java.util.StringTokenizer;

public class Expresion {
    private static String postfix;
/*Este metodo recibe una expresion en infix y la traduce a postfix    
    @param operacion es la operacion que se escribe en la pantalla de la calculadora despues de ser validada
    @return la mima operacion pero traducida a postfix
    */
    public static String traducePostfix(String operacion){
        StringBuilder res = new StringBuilder();
        ArrayStack<Character> expre= new ArrayStack();
        char temp;
        for (int i=0;i<operacion.length();i++){
            temp=operacion.charAt(i);
            if (determinaNumero(temp) || temp=='.'){
              res.append(temp);
              try{
            if(!determinaNumero(operacion.charAt(i+1)) && operacion.charAt(i+1)!='.')
                res.append(' ');
              }catch(Exception e){
                  res.append(' ');
              }
            }//if
            else
                if (determinaParentesis(temp)){
                    if (temp=='(')
                        expre.push(temp);
                else
                    while(!expre.isEmpty() && expre.peek()!='(')
                        res.append(expre.pop()+" ");
                    if (!expre.isEmpty() && expre.peek()=='(')
                        expre.pop();
                }//if
                else{
                    if (determinaOperador(temp)>0){
                        if (temp=='-' && (i==0 ||  operacion.charAt(i-1)=='(')){
                             res.append(temp);
                        }//if
                        else{
                        while (!expre.isEmpty() && temp<=determinaOperador(expre.peek()))
                       
                            res.append(expre.pop()+" ");
                        expre.push(temp);
                        }//else
                    }//if
                }//else
            
                
        }//for      
          while (!expre.isEmpty())
              if(expre.peek()!='(')
              res.append(expre.pop()+" ");
          else
              expre.pop();
        
        postfix=res.toString();
        return postfix;
    }//method
    /*este metodo determina si el caracrer que recibe es un numero
        @paramter c es un caracter de la expresion en la pantalla de la calculadora
        @return el caracter es numero o no
    */
    public static boolean determinaNumero(char c){
        return (c>='0' && c<='9');
    }//method
    /*este metodo determina si el caracrer que recibe es un operador
        @paramter c es un caracter de la expresion en la pantalla de la calculadora
        @return el caracter es un operador o no
    */
    public static int determinaOperador(char c){
        int res;
        switch(c){
            case'+': case'-': res=1; break;
            case'*': case'/': res=2; break;
            case'^': res=3; break;
            default: res=-1;
        }//switch
            return res;
    }//method
    /*este metodo determina si el caracrer que recibe es un caracter valido en la expresion
        @paramter c es un caracter de la expresion en la pantalla de la calculadora
        @return el caracter es valido o no
    */
    public static boolean determinaCaracterValido(char c){
        return (c<='9' && c>='0') || determinaParentesis(c) || determinaOperador(c)>0 || c=='.';
    }//method
    /*este metodo determina si el caracrer que recibe es un parentesis
        @paramter c es un caracter de la expresion en la pantalla de la calculadora
        @return el caracter es un parentesis o no
    */
    public static boolean determinaParentesis(char c){
        return (c=='(' || c==')');
    }//method
    /*este metodo determina si los parentesis en la expresion estan correctamente abiertos y cerrados
        @paramter expre es la expresion en la pantalla de la calculadora
        @return la validez del orden de los parentesis escritos
    */
    public static boolean verificaParentesis(String expre){
        int i=0;
        boolean res= true;
        char p;
        ArrayStack<Character> parentesis= new ArrayStack();
        while (res==true && i<expre.length()){
            
            p= expre.charAt(i);
            if (determinaParentesis(p)){
                if (!parentesis.isEmpty()){
                    if (parentesis.peek()!=p)
                        parentesis.push(p);
                    else
                        res=false;
                }//if
                else{
                    if (p=='(')
                        parentesis.push(p);
                else
                        res=false;
                }    
            }//if
            i++;
        }//while
        if (!parentesis.isEmpty())
        if (parentesis.peek()=='(')
            res=false;
        return res;
    }//method
    /*este metodo determina si la expresion es valida
        @paramter expre es la expresion escrita en la pantalla de la calculadora
        @return la validez de la expresion
    */
    public static boolean verificaExpresion(String expre){
        ArrayStack<Character> c = new ArrayStack();
        boolean res= verificaParentesis(expre);
        int i=0;
        while(res==true && i< expre.length()){    
            if (determinaCaracterValido(expre.charAt(i))){
            if (determinaParentesis(expre.charAt(i))){
                c.push(expre.charAt(i));
            }//if
            else
                if (determinaOperador(expre.charAt(i))>0){
                    try{
                        if (determinaOperador(expre.charAt(i+1))>0){
                            res=false;
                        }//if
                    }catch(Exception e){
                        res=false;
                    }//catch
                }//if
            }//if
            else
                res=false;
            i++;
        }//while
            
        
        return res;
    }//method
    /*este metodo regresa el resultado de una expresion en postfix
        @paramter expre es la expresion traducida a postfix
        @return el resultado de la operacion
    */
    public static double resuelvePostfix (String expre){
        ArrayStack<Caracter> temp= new ArrayStack();
        StringTokenizer tok = new StringTokenizer(expre, " ");
        double t=-10000, res=0;
        char op=' ';
        String token;
        while (tok.hasMoreTokens()){
            System.out.println(temp.toString());
            token=tok.nextToken();
            if (token.length()>1)
            t=Double.parseDouble(token);
            else
                try{
                    t=Double.parseDouble(token);
                }catch(Exception e){
                        op=token.charAt(0);
                }//catch
            if (t!=-10000)
               temp.push(new Numero(t));
            else{
                
                //temp.push(new ParentesisUOperador(op));
            switch(op){
                case'+':res= ((Numero)temp.pop()).getNum()+((Numero)temp.pop()).getNum();break;
                case'-':double h=((Numero)temp.pop()).getNum(); res=((Numero)temp.pop()).getNum()-h;break;
                case'*':res= ((Numero)temp.pop()).getNum()*((Numero)temp.pop()).getNum();break;
                case'/':h=((Numero)temp.pop()).getNum(); res=((Numero)temp.pop()).getNum()/h;break;
            }
            temp.push(new Numero(res));
            }
            op=' ';
            t=-10000;
        }//while
        
        return res;
    }//method
    
    
    public static void main(String[] args) {
        System.out.println(verificaExpresion("4*(-2)"));
        System.out.println(traducePostfix("4*(-2)"));
        System.out.println(resuelvePostfix(traducePostfix("4*(-2)")));
        
        System.out.println(verificaExpresion("5-4"));
        System.out.println(traducePostfix("5-4"));
        System.out.println(resuelvePostfix(traducePostfix("5-4")));
        
        System.out.println(verificaExpresion("2+(10/5)"));
        System.out.println(traducePostfix("2+(10/5)"));
        System.out.println(resuelvePostfix(traducePostfix("2+(10/5)")));
        
        System.out.println("(4+(8-6))*2");
                System.out.println(verificaExpresion("(4.5+(8-6))*2"));
        System.out.println(traducePostfix("(4.5+(8-6))*2"));
        System.out.println(resuelvePostfix(traducePostfix("(4.5+(8-6))*2")));
        
    }//main
    
  
    
    
    
}//class
