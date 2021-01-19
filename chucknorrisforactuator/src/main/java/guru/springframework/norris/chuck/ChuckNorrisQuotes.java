package guru.springframework.norris.chuck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Simple list of Chuck Norris sayings.
 *
 * @author John Thompson
 */
public class ChuckNorrisQuotes {

    private List<String> quotes;

    public ChuckNorrisQuotes() {

        quotes = Arrays.asList(
             "Chuck Norris cannot love, he can only not kill.",
             "All browsers support the hex definitions #chuck and #norris for the colors black and blue.",
             "Chuck Norris had to stop washing his clothes in the ocean. The tsunamis were killing people.",
             "Chuck Norris can install a 64 bit OS on 32 bit machines.",
             "Fool me once, shame on you. Fool Chuck Norris once and he will roundhouse kick you in the face.",
             "Chuck Norris compresses his files by doing a flying round house kick to the hard drive.",
             "MacGyver can build an airplane out of gum and paper clips. Chuck Norris can kill him and take it.",
             "Chuck Norris played Russian Roulette with a fully loaded gun and won",
             "Chuck Norris's keyboard doesn't have a Ctrl key because nothing controls Chuck Norris.",
             "Chuck Norris recently had the idea to sell his urine as a canned beverage. We know this beverage"
             + " as Red Bull.",
             "Chuck Norris can read from an input stream.",
             "When Chuck Norris is in a crowded area, he doesn't walk around people. He walks through them.",
             "Chuck Norris grinds his coffee with his teeth and boils the water with his own rage.",
             "The chemical formula for the highly toxic cyanide ion is CN-."
             + " These are also Chuck Norris' initials. This is not a coincidence.",
             "Chuck Norris doesn't use web standards as the web will conform to him.",
             "Maslow's theory of higher needs does not apply to Chuck Norris. He only has two needs: killing"
             + " people and finding people to kill.",
             "Chuck Norris did in fact, build Rome in a day.",
             "Chuck Norris doesn't use Oracle, he is the Oracle.",
             "They say curiosity killed the cat. This is false. Chuck Norris killed the cat. Every single one of them.",
             "A Chuck Norris-delivered Roundhouse Kick is the preferred method of execution in 16 states.",
             "Chuck Norris is the only person in the world that can actually email a roundhouse kick.",
             "Product Owners never ask Chuck Norris for more features. They ask for mercy.",
             "Chuck Norris is the only person to ever win a staring contest against Ray Charles and Stevie Wonder.",
             "Chuck Norris doesn't need an OS.",
             "Chuck Norris doesn't need garbage collection because he doesn't call .Dispose(), he calls .DropKick().",
             "Chuck Norris ordered a Big Mac at Burger King, and got one.",
             "Chuck Norris is not Politically Correct. He is just Correct. Always.",
             "One time, at band camp, Chuck Norris ate a percussionist.",
             "Chuck Norris doesn't need to use AJAX because pages are too afraid to postback anyways.",
             "Chuck Norris knows everything there is to know - Except for the definition of mercy.",
             "Divide Chuck Norris by zero and you will in fact get one........one bad-ass that is.",
             "Chuck Norris' unit tests don't run. They die.",
             "The Drummer for Def Leppard's only got one arm. Chuck Norris needed a back scratcher.",
             "Chuck Norris' programs never exit, they terminate.",
             "Chuck Norris can write multi-threaded applications with a single thread.",
             "Chuck Norris does not need to know about class factory pattern. He can instantiate interfaces.",
             "If you work in an office with Chuck Norris, don't ask him for his three-hole-punch.",
             "Chuck Norris uses tabasco sauce instead of visine.",
             "When Chuck Norris break the build, you can't fix it, because there is not a single line of code left.",
             "Chuck Norris can make a class that is both abstract and final.",
             "When Chuck Norris does a pushup, he isn't lifting himself up, he's pushing the Earth down.",
             "As an infant, Chuck Norris' parents gave him a toy hammer. He gave the world Stonehenge.",
             "Little Miss Muffet sat on her tuffet, until Chuck Norris roundhouse kicked her into a glacier.",
             "The quickest way to a man's heart is with Chuck Norris' fist.",
             "Code runs faster when Chuck Norris watches it.",
             "If you spell Chuck Norris in Scrabble, you win. Forever.",
             "TNT was originally developed by Chuck Norris to cure indigestion.",
             "July 4th is Independence day. And the day Chuck Norris was born. Coincidence? I think not.",
             "In a fight between Batman and Darth Vader, the winner would be Chuck Norris.",
             "When Chuck Norris does division, there are no remainders.",
             "If Chuck Norris writes code with bugs, the bugs fix themselves.",
             "Jean-Claude Van Damme once kicked Chuck Norris' ass. He was then awakened from his dream by a"
             + " roundhouse kick to the face.",
             "If you try to kill -9 Chuck Norris's programs, it backfires.",
             "Chuck Norris can unit test entire applications with a single assert.",
             "Chuck Norris knows the value of NULL, and he can sort by it too.",
             "Chuck Norris invented black. In fact, he invented the entire spectrum of visible light."
             + " Except pink. Tom Cruise invented pink.",
             "Chuck Norris can lead a horse to water AND make it drink.",
             "Chuck Norris's first program was kill -9.",
             "Chuck Norris once participated in the running of the bulls. He walked.",
             "Chuck Norris's log statements are always at the FATAL level.",
             "One time, Chuck Norris accidentally stubbed his toe. It destroyed the entire state of Ohio.",
             "Chuck Norris doesn't chew gum. Chuck Norris chews tin foil.",
             "If tapped, a Chuck Norris roundhouse kick could power the country of Australia for 44 minutes.",
             "Chuck Norris doesn't churn butter. He roundhouse kicks the cows and the butter comes straight out.",
             "Chuck Norris does not need to type-cast. The Chuck-Norris Compiler (CNC) sees through things."
             + " All way down. Always.",
             "Chuck Norris has banned rainbows from the state of North Dakota.",
             "Bill Gates thinks he's Chuck Norris. Chuck Norris actually laughed. Once.",
             "Chuck Norris once ate an entire bottle of sleeping pills. They made him blink.",
             "Chuck Norris's brain waves are suspected to be harmful to cell phones.",
             "Aliens DO indeed exist. They just know better than to visit a planet that Chuck Norris is on.",
             "What was going through the minds of all of Chuck Norris' victims before they died? His shoe.",
             "Chuck Norris can write infinite recursion functions and have them return.",
             "Chuck Norris doesn't use reflection, reflection asks politely for his help.",
             "Chuck Norris crossed the road. No one has ever dared question his motives.",
             "Chuck Norris puts his pants on one leg at a time, just like the rest of us. The only difference is,"
             + " then he kills people.",
             "Chuck Norris can set ants on fire with a magnifying glass. At night.",
             "Only Chuck Norris can prevent forest fires.",
             "Chuck Norris likes his coffee half and half: half coffee grounds, half wood-grain alcohol.",
             "Ninjas want to grow up to be just like Chuck Norris. But usually they grow up just to be"
             + " killed by Chuck Norris.",
             "Chuck Norris's show is called Walker: Texas Ranger, because Chuck Norris doesn't run.",
             "Simply by pulling on both ends, Chuck Norris can stretch diamonds back into coal.",
             "It takes 14 puppeteers to make Chuck Norris smile, but only 2 to make him destroy an orphanage.",
             "Chuck Norris brushes his teeth with a mixture of iron shavings, industrial paint remover,"
             + " and wood-grain alcohol.   ",
             "Industrial logging isn't the cause of deforestation. Chuck Norris needs toothpicks.",
             "Chuck Norris doesn't do Burn Down charts, he does Smack Down charts.",
             "If Chuck Norris wants your opinion, he'll beat it into you.",
             "On his birthday, Chuck Norris randomly selects one lucky child to be thrown into the sun.",
             "Chuck Norris doesn't bowl strikes, he just knocks down one pin and the other nine faint.",
             "According to Einstein's theory of relativity, Chuck Norris can actually roundhouse kick you yesterday.",
             "Chuck Norris' first job was as a paperboy. There were no survivors.",
             "Chuck Norris does infinite loops in 4 seconds.",
             "Chuck Norris doesn't pair program.",
             "Paper beats rock, rock beats scissors, and scissors beats paper, but Chuck Norris beats all 3"
             + " at the same time.",
             "Chuck Norris qualified with a top speed of 324 mph at the Daytona 500, without a car.",
             "Count from one to ten. That's how long it would take Chuck Norris to kill you...Fourty seven times.",
             "Chuck Norris insists on strongly-typed programming languages.",
             "All arrays Chuck Norris declares are of infinite size, because Chuck Norris knows no bounds.",
             "President Roosevelt once rode his horse 100 miles. Chuck Norris carried his the same distance"
             + " in half the time.",
             "Chuck Norris doesn't actually write books, the words assemble themselves out of fear.",
             "A study showed the leading causes of death in the United States are: 1. Heart disease, 2."
             + " Chuck Norris, 3. Cancer",
             "When Chuck Norris plays Monopoly, it affects the actual world economy.",
             "Superman once watched an episode of Walker, Texas Ranger. He then cried himself to sleep.",
             "Godzilla is a Japanese rendition of Chuck Norris' first visit to Tokyo.",
             "The class object inherits from Chuck Norris",
             "Everybody loves Raymond. Except Chuck Norris.",
             "Chuck Norris is the reason why Waldo is hiding.",
             "Two wrongs don't make a right. Unless you're Chuck Norris. Then two wrongs make a roundhouse"
             + " kick to the face",
             "Chuck Norris once pulled out a single hair from his beard and skewered three men through the"
             + " heart with it.",
             "Police label anyone attacking Chuck Norris as a Code 45-11.... A suicide.",
             "Chuck Norris can slam a revolving door.",
             "Ozzy Osbourne bites the heads off of bats. Chuck Norris bites the heads off of Siberian Tigers.",
             "Chuck Norris could use anything in java.util.* to kill you, including the javadocs.",
             "When Chuck Norris goes to donate blood, he declines the syringe, and instead requests"
             + " a hand gun and a bucket.",
             "Chuck Norris doesn't daydream. He's too busy giving other people nightmares.",
             "Chuck Norris doesn't need a debugger, he just stares down the bug until the code confesses.",
             "Sticks and stones may break your bones, but a Chuck Norris glare will liquefy your kidneys.",
             "The First rule of Chuck Norris is: you do not talk about Chuck Norris.",
             "Chuck Norris doesn't wear a watch, HE decides what time it is.",
             "Chuck Norris causes the Windows Blue Screen of Death.",
             "Chuck Norris can compile syntax errors.",
             "Chuck Norris once kicked a horse in the chin. Its decendants are known today as Giraffes.",
             "There are no such things as tornadoes. Chuck Norris just hates trailer parks.",
             "Chuck Norris is the only man who has, literally, beaten the odds. With his fists.",
             "Chuck Norris counted to infinity. Twice.",
             "Chuck Norris can put out a fire with a gallon of gasoline.",
             "Death once had a near-Chuck-Norris experience.",
             "Chuck Norris can kill your imaginary friends.",
             "Chuck Norris can hear sign language.",
             "Chuck Norris beat the sun in a staring contest.",
             "When Graham Bell invented the telephone, he had two missed calls from Chuck Norris",
             "Chuck Norris doesn't flush the toilet, he scares the shit out of it.",
             "Chuck Norris is so bad, when he slices onions, the onions cry.",
             "Chuck Norris knows how to exit VIM",
             "All the codes Chuck Norris wrote is cross platform and can be run on any electronic"
             + " device or quantum computer"
        );
    }

    public String getRandomQuote(){
        return quotes.get(ThreadLocalRandom.current().nextInt(0, quotes.size()));
    }
}
