/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubestba;

/**
 *
 * @author Kelompok 1
 */
public class LexicalAnalyzer {
    private String input;

    public LexicalAnalyzer(String input){
        this.input = input;
    }

    public void setInput(String input){
        this.input = input;
    }

    public String getInput(){
        return this.input;
    }

    public String Token( ){
        String token = "";
        char current;
        char[] data = input.toCharArray();
        int len = input.length();
        int i = 0;
        boolean galat = false;
        if(input!=null){
            while(i<len && !galat ){
                current = data[i];

                //pqrs
                if(current=='p'||current=='q'||current=='r'||current=='s'){
                    if(i+1==len)
                        token+="1 ";
						 
                    else if((data[i+1]==' '|| data[i+1]==')' || data[i+1]=='('  )&& (i+1)<len )
                        token+="1 ";
						 
                    else
                        galat = true;
                }
                //and
                else if(current == 'a'){
                    if(i+1==len)
                        galat = true;
                    else if(data[i+1]!= ' ' && (i+1)<len){
                        i=i+1;
                        current= data[i];
                        if(current=='n'){
                            if(i+1==len)
                                galat = true;
                            else if(data[i+1]!= ' ' && (i+1)<len){
                                i=i+1;
                                current= data[i];
                                if(current=='d'){
                                    if((i+1)==len)
                                        token+="3 ";
										 
                                    else if(data[i+1]==' '|| data[i+1]==')' || data[i+1]=='(' )
                                        token+="3 ";
										 
                                    else
                                        galat = true;

                                }
                                else{
                                    galat = true;
                                }
                            }
                            else{
                                galat = true;
                            }
                        }
                        else{
                            galat=true;
                        }
                    }
                    else{
                        galat=true;
                    }
                }

                //or
                else if(current=='o'){
                    if(i+1==len)
                        galat=true;
                    else if(data[i+1]!=' ' && (i+1)<len ){
                        i=i+1;
                        current = data[i];
                        if(current=='r'){
                            if((i+1)==len )
                                token+="4 ";
								 
                            else if(data[i+1]==' '|| data[i+1]==')' || data[i+1]=='(' )
                                token+="4 ";
								 
                            else
                                galat=true;
                        }
                        else{
                            galat=true;
                        }
                    }
                    else{
                        galat = true;
                    }
                }

                //not
                else if(current == 'n'){
                    if(i+1==len)
                        galat=true;
                    else if(data[i+1]!=' ' && (i+1)<len){
                        i++;
                        current = data[i];
                        if(current=='o'){
                            if(i+1==len)
                                galat = true;
                            else if(data[i+1]!=' ' && (i+1)<len){
                                i++;
                                current = data[i];
                                if(current=='t'){
                                    if(i+1==len)
                                        token+="2 ";
										 
                                    else if(data[i+1]==' '|| data[i+1]==')' || data[i+1]=='(')
                                        token+="2 ";
										 
                                    else
                                        galat = true;
                                }
                                else
                                    galat = true;
                            }
                            else
                                galat= true;
                            }
                            else
                                galat = true;

                        }

                    }

                // simbol (
                else if(current=='(')
                        token+="9 ";
						 

                // simbol )
                else if(current==')')
                        token+="10 ";
						 

				//xor
				else if(current == 'x'){
                    if(i+1==len)
                        galat = true;
                    else if(data[i+1]!= ' ' && (i+1)<len){
                        i=i+1;
                        current= data[i];
                        if(current=='o'){
                            if(i+1==len)
                                galat = true;
                            else if(data[i+1]!= ' ' && (i+1)<len){
                                i=i+1;
                                current= data[i];
                                if(current=='r'){
                                    if((i+1)==len)
                                        token+="5 ";
										 
                                    else if(data[i+1]==' '|| data[i+1]==')' || data[i+1]=='(' )
                                        token+="5 ";
										 
                                    else
                                        galat = true;

                                }
                                else{
                                    galat = true;
                                }
                            }
                            else{
                                galat = true;
                            }
                        }
                        else{
                            galat=true;
                        }
                    }
                    else{
                        galat=true;
                    }
                }

				//if
				else if(current=='i'){
                    if(i+1==len)
                        galat=true;
                    else if(data[i+1]!=' ' && (i+1)<len ){
                        i=i+1;
                        current = data[i];
						//if
                        if(current=='f'){
							if (data[i+1]==' '|| data[i+1]==')' || data[i+1]=='(' ){
								if((i+1)==len )
									token+="6 ";
									 
								else if(data[i+1]==' '|| data[i+1]==')' || data[i+1]=='(' )
									token+="6 ";
									 
								else
									galat=true;
							}
							//iff
							else if (data[i+1]=='f') {
								if (i+1==len)
									galat=true;
								else if (data[i+1]!=' ' && (i+1)<len){
									i=i+1;
									current= data[i];
										if(current=='f'){
											if((i+1)==len)
												token+="8 ";
												 
											else if(data[i+1]==' '|| data[i+1]==')' || data[i+1]=='(' )
												token+="8 ";
												 
											else
												galat = true;
										}
										else{
											galat = true;
										}

									}
									else{
										galat = true;
									}
							}
							else{
                                galat = true;
							}

                        }
                        else{
                            galat=true;
                        }
                    }
                    else{
                        galat = true;
                    }
                }

				//then
				else if(current == 't'){
                    if(i+1==len)
                        galat = true;
                    else if(data[i+1]!= ' ' && (i+1)<len){
                        i=i+1;
                        current= data[i];
                        if(current=='h'){
                            if(i+1==len)
                                galat = true;
                            else if(data[i+1]!= ' ' && (i+1)<len){
                                i=i+1;
                                current= data[i];
                                if(current=='e'){
									if (i+1==len)
										galat = true;
									else if (data[i+1]!=' ' && (i+1)<len){
										i=i+1;
										current= data[i];
										if(current=='n'){
											if((i+1)==len)
												token+="7 ";
												 
											else if(data[i+1]==' '|| data[i+1]==')' || data[i+1]=='(' )
												token+="7 ";
												 
											else
												galat = true;
										}
										else{
											galat = true;
										}

									}
									else{
                                    galat = true;
									}
                                }
                                else{
                                    galat = true;
                                }
                            }
                            else{
                                galat = true;
                            }
                        }
                        else{
                            galat=true;
                        }
                    }
                    else{
                        galat=true;
                    }
                }

				//
                else if(current!=' '){
                    galat = true;
                }

                i++;
            }

        }
        else{
            galat = true;
        }
        if(galat){
            return token+"error ";
        }
        else{
            return token;
        }
    }
}
