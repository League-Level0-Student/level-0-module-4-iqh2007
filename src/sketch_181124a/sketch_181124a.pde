
 PImage cat;
void  setup() {
  
   cat = loadImage("tesla-cat.jpg");
  size(800,500);
    cat.resize(width,height);
        background(cat);


  
  
}

void draw(){
 background(cat);
println("x;" + mouseX + "y;" + mouseY);  
 ellipse(mouseX,mouseY,15,15);
 ellipse(mouseX +124,mouseY + 8,15,15); 
  
}
//x1=430
//x2=455
//y1 =211
//y2=229