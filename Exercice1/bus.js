/* Exemples a selectionner pour vérifier la fonction
number([[10,0],[3,5],[5,8]]) -> 5
number([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]]) -> 17
number([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]) -> 21

A effectuer : Créer une fonction en programmation fonctionnelle javascript, prend argument le tableau de tableaux, et dans chaque pair de valeur, additionne le nombre de gauche et soustrait le nombre de droite.
*/

let tableau = [[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]];

const comptePersonnes = tableau.reduce((acc, [gauche, droite]) => {
    return acc + gauche - droite;
}, 0);

console.log(comptePersonnes);