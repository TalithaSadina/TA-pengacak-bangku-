/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengacak.bangku;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class acak {
    public class pengacak{
        public int angkaAcak;
        public int array_siswa;
    }
    public static int getangkaAcak(){
        Random ran = new Random();
        int t= ran.nextInt(17);   
        return t;
    }
    public static int getarray_siswa(int index){
        int array_siswa[] = new  int[38];
array_siswa[0] = 1;
array_siswa[1] = 2;
array_siswa[2] = 3;
array_siswa[3] = 4;
array_siswa[4] = 5;
array_siswa[5] = 6;
array_siswa[6] = 7;
array_siswa[7] = 8;
array_siswa[8] = 9;
array_siswa[9] = 10;
array_siswa[10] = 11;
array_siswa[11] = 12;
array_siswa[12] = 13;
array_siswa[13] = 14;
array_siswa[14] = 15;
array_siswa[15] = 16;
array_siswa[16] = 17;
array_siswa[17] = 18;
array_siswa[18] = 19;
array_siswa[19] = 20;
array_siswa[20] = 21;
array_siswa[21] = 22;
array_siswa[22] = 23;
array_siswa[23] = 24;
array_siswa[24] = 25;
array_siswa[25] = 26;
array_siswa[26] = 27;
array_siswa[27] = 28;
array_siswa[28] = 29;
array_siswa[29] = 30;
array_siswa[30] = 31;
array_siswa[31] = 32;
array_siswa[32] = 33;
array_siswa[33] = 34;
array_siswa[34] = 35;
array_siswa[35] = 36;
array_siswa[36] = 37;
array_siswa[37] = 38;
        

return array_siswa[index];
        
    }
    
}
