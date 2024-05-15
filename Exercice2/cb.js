/* 
maskify('4556364607935616') -> '############5616'
maskify('1') -> '1'
maskify('11111') -> '#1111'
Ecrire une fonction maskify en javascript fonctionnel qui modifie tous les caractères d'une chaine de caractère entrée en '#' sauf les quatre derniers.
utilisation de la fonction .repeat et de la fonction .slice
*/
const maskify = (chaine) => {
    if (chaine.length <= 4) {
        return chaine;
    }

    const derniersCaracteres = chaine.slice(-4);

    const masque = '#'.repeat(chaine.length - 4);

    const chaineMasquee = masque + derniersCaracteres;

    return chaineMasquee;
};

const chaine = '41111'
console.log(maskify(chaine));