// Definir el objeto libro
var libro = {
    ISBN: "",
    titulo: "",
    autor: "",
    numPaginas: 0,
    cargarLibro: function() {
      this.ISBN = prompt("Ingrese el número de ISBN:");
      this.titulo = prompt("Ingrese el título del libro:");
      this.autor = prompt("Ingrese el autor del libro:");
      this.numPaginas = parseInt(prompt("Ingrese el número de páginas:"));
    },
    informarLibro: function() {
      console.log("ISBN: " + this.ISBN);
      console.log("Título: " + this.titulo);
      console.log("Autor: " + this.autor);
      console.log("Número de páginas: " + this.numPaginas);
    }
  };
  
  // Cargar el libro y mostrar la información
  libro.cargarLibro();
  libro.informarLibro();
  