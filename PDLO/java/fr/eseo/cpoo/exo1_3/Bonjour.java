package fr.eseo.cpoo.exo1_3;
class Bonjour {
    public static void main ( String [] args ){
        System . out . println ( " Bonjour cher utilisateur " );
        System . out . println ( " Voici les arguments passés" + " en ligne de commande : " );
        for ( int i =0; i < args . length ; i ++){
            System . out . println ( " Argument Numéro" + ( i +1) + "  :  " + args [ i ]);
        }
    }
}