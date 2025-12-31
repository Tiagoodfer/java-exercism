class SqueakyClean {

    static String clean(String identifier) {

        StringBuilder resultado = new StringBuilder();
        boolean capitalizeNext = false;

        for (char ch : identifier.toCharArray()) {

            if (ch == ' ') {
                resultado.append('_');
                capitalizeNext = false;
                continue;
            }

            if (ch == '-') {
                capitalizeNext = true;
                continue;
            }

            switch (ch) {
                case '4': ch = 'a'; break;
                case '3': ch = 'e'; break;
                case '0': ch = 'o'; break;
                case '1': ch = 'l'; break;
                case '7': ch = 't'; break;
                default: break;
            }

            if (capitalizeNext) {
                ch = Character.toUpperCase(ch);
                capitalizeNext = false;
            }

            if (Character.isLetter(ch) || ch == '_') {
                resultado.append(ch);
            }
        }

        return resultado.toString();
    }
}
