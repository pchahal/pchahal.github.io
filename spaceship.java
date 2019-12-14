class Main {
  public static void main(String[] args) {
    // Step 3: Create instance of Spaceship called falcon here 
    Spaceship falcon = new Spaceship("uhhh",100,0);
    // Step 6: Create an instance of Fighter called destroyer here 
    
    // Step 9: Create an instance of ShieldedShip called defender here
  }
}

class Spaceship {
  String name;
  int health;
  int position;

  // Step 1: Create constructor her
 public void Spaceship(String name, int health, int position)
{
  this.name = name;
  this.health = health;
  this.position = position;
}
  void moveLeft() {
    position -= 1;
  }
    
  void moveRight() {
    position += 1;
  }
    
  void wasHit() {
    health -= 5;
  }
}

// Step 2: Comment out (do not delete) all the code below this line
// this includes the two classes, Fighter and Shielded Ship

class Fighter extends Spaceship {
  String weapon;
  int remainingFirePower;

  // Step 5: Create constructor for Fighter here 
  public void Fighter(String weapon, int remainingFirePower,String name, int health, int position)
  {
    super(name,health,position);
    this.weapon = weapon;
    this.remainingFirePower = remainingFirePower;
  }
  void fire() {
    if (remainingFirePower > 0) {
      remainingFirePower -= 1;
    }
    else {
      System.out.println("You have no more fire power.");
    }
  }
}
/*
class ShieldedShip extends Fighter {
  int shieldStrength;

  // Step 8: Create constructor for ShieldedShip here 

  
  // Overridden from Fighter class
  void wasHit() {
    if (shieldStrength > 0) {
      shieldStrength -= 5;
    }
    else {
      super.wasHit();
    }
  }
}
*/˜