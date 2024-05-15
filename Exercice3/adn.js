/*
DNAStrand ("ATTGC") -> "TAACG"
DNAStrand ("GTAT") -> "CATA"

Creation de fonction qui donne le complémentaire ADN en inversant A & T et C & G dans une chaine de caractère prise en entrée.
Utilisation de la fonction replace.
*/

const DNAStrand = (chaine) => {
    return chaine.replace('A', 'T').replace('T', 'A').replace('C', 'G').replace('G', 'C')
};

const chaine = "ATTGC";
console.log(DNAStrand(chaine));