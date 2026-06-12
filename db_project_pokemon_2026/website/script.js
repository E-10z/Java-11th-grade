async function init_pokemon() {
  let link = "https://symmetrical-space-fortnight-r464p9x54g56fp7qq-8000.app.github.dev/";
  let response = await fetch(link);
  let pokemon = await response.json();
  generateCards(pokemon);
}

function generateCards(pokemon) {
  let output = document.getElementById("centerpanel");
  let build = "";

  for (let i = 0; i < pokemon.length; i++) {
    let poke = pokemon[i];

    build += '<div class="card">';
    build += `<h1>Name: ${poke.Name}</h1>`;
    build += `<h3>Main type: ${poke.Type}</h3>`;
    build += `<h4>Weight: ${poke.Weight} lbs</h4>`;
    build += `<h4>Height: ${poke.Height} meters</h4>`;
    build += `<img src="images/${poke.Name}.png">`;
    build += `<hr>`;
    build += '</div>';
  }

  output.innerHTML = build;
}

function filter_pokemon() {
  let name = document.getElementById("filter").value;
  console.log(name);

  let new_pokemon = [];

  for (let i = 0; i < pokemon.length; i++) {
    if (pokemon[i].Name == name) {
      new_pokemon.push(pokemon[i]);
    }
  }

  generateCards(new_pokemon);
}