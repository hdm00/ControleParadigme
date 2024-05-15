/*
CreatePhoneNumber ([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) -> "(123) 456-7890"
Création fonction CreatePhoneNumber qui prend en entrée tableau de 10 entiers et renvoie chaine sous forme de numéro
Utilisation de la fonction join
*/

const CreatePhoneNumber = (tableau) => {
    const troisPremiers = tableau.slice(0, 3).join("");
    const troisSeconds = tableau.slice(3, 6).join("");
    const quatreDerniers = tableau.slice(6).join("");

    const numero = "(" + troisPremiers + ")" + " " + troisSeconds + "-" + quatreDerniers;
    return numero
};

const tableau = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
console.log(CreatePhoneNumber(tableau));