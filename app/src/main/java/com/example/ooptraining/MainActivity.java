package com.example.ooptraining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.example.ooptraining.HouseDecor.room;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    User user= new User("Enes","Öğrenci");
        System.out.println(user.name);

    //encapsulation
        Musician musician=new Musician("ali","keman",25);
        musician.setAge(21);
        musician.setInstrument("flüt","26533");
        System.out.println(musician.getInstrument());
        musician.setInstrument("gitar","22415");
        System.out.println(musician.getInstrument());
    //inheritance
        SuperMusician superMusician=new SuperMusician("slave","tec",54);
        superMusician.getAge();
        superMusician.sing();

    //polymorphism
     //static
        Mathematics sum=new Mathematics();
     sum.sum();
     sum.sum(5,6);
     sum.sum(5,5,4);

     //dynamic
     Animal myAnimal=new Animal();
     myAnimal.sing();

     Dog karabas =new Dog();
     karabas.test();
     karabas.sing();

     user.info();
     Piano myPiano=new Piano();
     myPiano.brand="Yamaha";
     myPiano.digital=false;
     myPiano.bilgi();



}
}