public class Schifffahrt
{
  public static void main(String[] args)
  {
    final int S1_TONNAGE = 1000;
    final int S2_TONNAGE = 2000;
    final int S2_SEGELFLAECHE = 200;
    final int S3_TONNAGE = 3000;
    final int S3_MOTORLEISTUNG = 30;
    
    Schiff s1 = new Schiff(S1_TONNAGE);
    Segelschiff s2 = new Segelschiff(S2_TONNAGE,S2_SEGELFLAECHE);
    Motorschiff s3 = new Motorschiff(S3_TONNAGE,S3_MOTORLEISTUNG);
    
    System.out.println("s1: " + s1.toString());
    // s1: Schiff[tonnage=1000]
    
    System.out.println("s2: " + s2.toString());
    // s2: Segelschiff[segelflaeche=200, Schiff[tonnage=2000]]
    
    System.out.println("s3: " + s3.toString());
    // s3: Motorschiff[motorleistung=30, Schiff[tonnage=3000]]
    
    Schiff c;
    if(args.length == 0){
      c = s2;
    }
    else{
      c = s3;
    }
    System.out.println("c:  " + c.toString());
  }
}
