/*
Filter_list ([1,2, 'a', 'b']) -> [1,2]
Filter_list ([1, 'a', 'b', 0,15]) -> [1,0,15]
Filter_list ([1,2, 'aasf', '3', '124', 123]) -> [1,2,123]

Creation de fonction Filter_list qui prend en entrée liste et renvoie lsit filtrée contenant suelement les nombres
utilisation de la fonction parseInt pour vérification nombre
*/

const Filter_list = (liste) => {
    const listefiltree = liste.filter((element) => {
        return !isNaN(parseInt(element));
    })
    return listefiltree
};

const liste = [1, 'a', 'b', 0,15];
console.log(Filter_list(liste));