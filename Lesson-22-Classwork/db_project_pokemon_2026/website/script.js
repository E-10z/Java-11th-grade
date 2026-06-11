let pokemon; 

async function init_customers() {
  let link = "https://crispy-winner-jj7567x5wpqw2qp9p-8000.app.github.dev/";
  let route = "Pokemon";
  let info = await fetch(link + route);
  pokemon = await info.json();
  generateCards_customers(pokemon);
  console.log(pokemon);
}
 
 
function generateCards_customers(pokemon) {
  let output = document.getElementById("centerpanel");
  let build = "";
 
  for (let i = 0; i < pokemon.length; i++) {
    let p = pokemon[i];
 
    const name          = p.name;
    const weight        = p.weight;
    const height        = p.height;
    const type          = p.type;
    const evolutionStage = p.evolutionStage;
 
    // Normalize type class: convert spaces to hyphens and lowercase for consistent filtering
    const typeClass = type.replace(/\s+/g, "-").toLowerCase();
 
    build += `<div class="card filterDiv ${typeClass} show">`;
    build += `<h1>Name: ${name}</h1>`;
    build += `<h3>Type: ${type}</h3>`;
    build += `<h4>Weight: ${weight} kg</h4>`;
    build += `<h4>Height: ${height} m</h4>`;
    build += `<h4>Evolution Stage: ${evolutionStage}</h4>`;
    build += `<hr></div>`;
  }
 
  output.innerHTML = build;
}
 
function filterSelection(button, selectedCategory) {
  var cards, filterButtons, btnContainer, i;
  //gets element by class
  cards = document.getElementsByClassName("filterDiv");
  if (selectedCategory == "all") selectedCategory = "";
  for (i = 0; i < cards.length; i++) {
    //removes from list based on filter
    cards[i].classList.remove("show");
    //adds to list based on filter - now case-insensitive
    if (selectedCategory === "" || cards[i].className.toLowerCase().indexOf(selectedCategory.toLowerCase()) > -1) {
      cards[i].classList.add("show");
    }
  }
  //creates the filtering buttons
  btnContainer = document.getElementById("filterBtnContainer");
  filterButtons = btnContainer.getElementsByClassName("btn");
  for (i = 0; i < filterButtons.length; i++) {
    filterButtons[i].classList.remove("active");
  }
  button.classList.add("active");
}
