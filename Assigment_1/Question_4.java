public class Question_4 {
    public static void main(String[] args) {
        char ch[]={'c','a','r','b','o','n'};
        int count=0;
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;j++){
                for(int k=0;k<ch.length;k++){
                    for(int l=0;l<ch.length;l++){
                        for(int m=0;m<ch.length;m++){
                            for(int n=0;n<ch.length;n++){
                                if((i!=j)&&(i!=k)&&(i!=l)&&(i!=m)&&(i!=n)){
                                    if((j!=k)&&(j!=l)&&(j!=m)&&(j!=n)){
                                        if((k!=l)&&(k!=m)&&(k!=n)){
                                            if((l!=m)&&(l!=n)){
                                                if((m!=n)){
                                                    System.out.println(ch[i]+""+ch[j]+""+ch[k]+""+ch[l]+""+ch[m]+""+ch[n]);
                                                    count++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Total number of combinations are "+count);
    }
}
