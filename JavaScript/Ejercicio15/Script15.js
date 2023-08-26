var circulo={
  radio:0,
  cargarRadio : function (){
    this.radio=parseFloat(prompt("Ingrese el radio: "));
  },
  calcularArea : function(){
    return Math.PI*Math.pow(this.radio,2);
    //console.log("El área del circulo es: "+Math.PI*Math.pow(this.radio,2));
  },
  calcularCircunferencia : function(){
    return Math.PI*this.radio*2;
    //console.log("La circunferencia del circulo es: "+Math.PI*this.radio*2);
  },   
};

circulo.cargarRadio();
var area=circulo.calcularArea();
var circunferencia=circulo.calcularCircunferencia();
console.log("El área del círculo: "+area.toFixed(2));
console.log("La circunferencia del círculo: "+circunferencia.toFixed(2));