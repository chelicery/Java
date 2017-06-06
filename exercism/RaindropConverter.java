class RaindropConverter {

            String convert(int number) {
                StringBuilder output = new StringBuilder();
                switch(number){
                    case(number % 3):















                }
                if( number % 3 == 0 )
                    output += "Pling";
                if( number % 5 == 0 )
                    output += "Plang";
                if( number % 7 == 0 )
                    output += "Plong";
                if( output == "")
                    output = Integer.toString(number);
                return output;
            }

        }