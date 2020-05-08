const API_URL = "/api/kunstgalerie";


 

window.addEventListener("load", async () => {    
    //Event Listener zum Knopf hinzufügen
    let button = document.getElementById("klick");
    button.addEventListener("click" , kgholen);

    let button2 = document.getElementById("klick2");
    button2.addEventListener("click", gmholen);



     
});


    
 function kgholen() {
 let kunstgalerietext = document.getElementById("kunstgalerietext");
  let kgid = kunstgalerietext.value; 
 getKunstgalerie(kgid);
 }
 function gmholen() {
     let kunstgalerietext = document.getElementById("kunstgalerietext");
  let kgid = kunstgalerietext.value;
 let gemaeldetext = document.getElementById("gemaeldetext");
  let gmid = gemaeldetext.value;
 getGemaelde(kgid, gmid);
}

async function getKunstgalerie(kgid){
    let kunstgalerie = await fetch(API_URL + "/" + kgid, {
        method: "GET"
    });
    kunstgalerie = await kunstgalerie.json();
    console.log(kunstgalerie);
    
}

async function getGemaelde(kgid, gmid){
    let gemaelde = await fetch(API_URL + "/" + kgid + "/gemaelde/" + gmid, {
        method: "GET"
    });
    gemaelde = await gemaelde.json();
    console.log(gemaelde);    
}
