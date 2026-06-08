let data, customers;

async function init_customers(){
let link = "https://symmetrical-space-fortnight-r464p9x54g56fp7qq-8000.app.github.dev/";
let route = "Pokemon";
info = await fetch(link + route);
customers = await info.json();
populateTypeDropdown();
generateCards_customers(customers);
console.log(customers);
}

function generateCards_customers(customers){
  let output = document.getElementById("centerpanel");
  let build = "";
  for(let i=0; i<customers.length; i++){
    let customer = customers[i];
    // Support both legacy capitalized keys and SQL-returned lowercase keys
    const name = customer.name || customer.Name || 'Unknown';
    const type = customer.type || customer.Type || 'Unknown';
    const weight = customer.weight || customer.Weight || '';
    const height = customer.height || customer.Height || '';
    const evo = customer.evolutionStage || customer.EvolutionStage || '';
    const id = customer.pokemon_id || customer.Pokemon_id || customer.pokemonId || customer.PokemonId || '';

    build += '<div class="card">';
    build += `<h1> Name: ${name}</h1>`;
    build += `<h3> Main type: ${type}</h3>`;
    if(weight !== '') build += `<h4> Weight: ${weight}</h4>`;
    if(height !== '') build += `<h4> Height: ${height}</h4>`;
    if(evo !== '') build += `<h4> Evolution stage: ${evo}</h4>`;
    if(id !== '') build += `<h5> ID: ${id}</h5>`;
    build += `<hr>`;
    build += '</div>'
  }
   output.innerHTML = build;

}

function populateTypeDropdown(){
  let select = document.getElementById("filterType");
  let types = new Set();
  
  for(let i = 0; i < customers.length; i++){
    let type = customers[i].type || customers[i].Type || '';
    if(type) types.add(type);
  }
  
  // Sort types and add them to dropdown
  let sortedTypes = Array.from(types).sort();
  for(let type of sortedTypes){
    let option = document.createElement("option");
    option.value = type;
    option.text = type;
    select.appendChild(option);
  }
}

function filter_customers(){
  let selectedType = document.getElementById("filterType").value;
  console.log("Filtering by type: " + selectedType);

  if(selectedType === ""){
    generateCards_customers(customers);
    return;
  }

  let filtered = [];
  for(let i = 0; i < customers.length; i++){
    let type = customers[i].type || customers[i].Type || '';
    if(type === selectedType){
      filtered.push(customers[i]);
    }
  }
  generateCards_customers(filtered);
}