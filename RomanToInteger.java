class RomanToInteger {
    public int romanToInt(String s) {

        HashMap<Character,Integer> valueMap= new HashMap();

        valueMap.put('I',1);
        valueMap.put('V',5);
        valueMap.put('X',10);
        valueMap.put('L',50);
        valueMap.put('C',100);
        valueMap.put('D',500);
        valueMap.put('M',1000);

       int val=0;
        for(int i=0;i<s.length()-1;i++)
        {
           char ch1=s.charAt(i);
           char ch2=s.charAt(i+1);
          
           if(valueMap.get(ch1)<valueMap.get(ch2))
           {
               val+= -1*valueMap.get(ch1);
           }
           else
           {
                val+= valueMap.get(ch1);
           }

        }

        val=val+valueMap.get(s.charAt(s.length()-1));

        return val;
        
    }
}
