package Template;

abstract class Template {


     void Collectoffer(){
         Howmuchaxles();
         Typeofengine();
         Typeofbody();
         Producer();
     }



     protected abstract void Producer();

     protected abstract void Typeofbody();

     protected abstract void Typeofengine();

     protected abstract void Howmuchaxles();

    protected void AddCondiments(String color){
        System.out.print("Color: "+color);
    }
 }
