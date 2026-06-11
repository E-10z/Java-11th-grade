async function init_customers() {
  let link = "https://symmetrical-space-fortnight-r464p9x54g56fp7qq-8000.app.github.dev/Pokemon";
  let response = await fetch(link);
  let pokemon = await response.json();
  generateCards(pokemon);
}

function generateCards(pokemon) {
  let output = "";

  for (let p of pokemon) {
    let typeClass = p.type.toLowerCase();
    typeClass = typeClass.replace(" ", "-");
    output += `
      <div class="card filterDiv ${typeClass} show">
        <h1>${p.name}</h1>
        <h3>Type: ${p.type}</h3>
        <h4>Weight: ${p.weight} kg</h4>
        <h4>Height: ${p.height} m</h4>
        <h4>Evolution: ${p.evolutionStage}</h4>
        <hr>
      </div>`;
  }

  document.getElementById("centerpanel").innerHTML = output;
}

function filterSelection(button, category) {
  let cards = document.getElementsByClassName("filterDiv");

  for (let card of cards) {
    card.classList.remove("show");
    if (category === "all" || card.classList.contains(category)) {
      card.classList.add("show");
    }
  }

  for (let btn of document.getElementsByClassName("btn")) {
    btn.classList.remove("active");
  }
  button.classList.add("active");
}