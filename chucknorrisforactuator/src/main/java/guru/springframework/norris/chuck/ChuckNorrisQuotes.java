package guru.springframework.norris.chuck;

import java.util.ArrayList;
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

        quotes = new ArrayList<>(124);

        quotes.add("Chuck Norris cannot love, he can only not kill.");
        quotes.add("All browsers support the hex definitions #chuck and #norris for the colors black and blue.");
        quotes.add("Chuck Norris had to stop washing his clothes in the ocean. The tsunamis were killing people.");
        quotes.add("Chuck Norris can install a 64 bit OS on 32 bit machines.");
        quotes.add("Fool me once, shame on you. Fool Chuck Norris once and he will roundhouse kick you in the face.");
        quotes.add("Chuck Norris compresses his files by doing a flying round house kick to the hard drive.");
        quotes.add("MacGyver can build an airplane out of gum and paper clips. Chuck Norris can kill him and take it.");
        quotes.add("Chuck Norris played Russian Roulette with a fully loaded gun and won");
        quotes.add("Chuck Norris's keyboard doesn't have a Ctrl key because nothing controls Chuck Norris.");
        quotes.add("Chuck Norris recently had the idea to sell his urine as a canned beverage. We know this beverage as Red Bull.");
        quotes.add("Chuck Norris can read from an input stream.");
        quotes.add("When Chuck Norris is in a crowded area, he doesn't walk around people. He walks through them.");
        quotes.add("Chuck Norris grinds his coffee with his teeth and boils the water with his own rage.");
        quotes.add("The chemical formula for the highly toxic cyanide ion is CN-. These are also Chuck Norris' initials. This is not a coincidence.");
        quotes.add("Chuck Norris doesn't use web standards as the web will conform to him.");
        quotes.add("Maslow's theory of higher needs does not apply to Chuck Norris. He only has two needs: killing people and finding people to kill.");
        quotes.add("Chuck Norris did in fact, build Rome in a day.");
        quotes.add("Chuck Norris doesn't use Oracle, he is the Oracle.");
        quotes.add("They say curiosity killed the cat. This is false. Chuck Norris killed the cat. Every single one of them.");
        quotes.add("A Chuck Norris-delivered Roundhouse Kick is the preferred method of execution in 16 states.");
        quotes.add("Chuck Norris is the only person in the world that can actually email a roundhouse kick.");
        quotes.add("Product Owners never ask Chuck Norris for more features. They ask for mercy.");
        quotes.add("Chuck Norris is the only person to ever win a staring contest against Ray Charles and Stevie Wonder.");
        quotes.add("Chuck Norris doesn't need an OS.");
        quotes.add("Chuck Norris doesn't need garbage collection because he doesn't call .Dispose(), he calls .DropKick().");
        quotes.add("Chuck Norris ordered a Big Mac at Burger King, and got one.");
        quotes.add("Chuck Norris is not Politically Correct. He is just Correct. Always.");
        quotes.add("One time, at band camp, Chuck Norris ate a percussionist.");
        quotes.add("Chuck Norris doesn't need to use AJAX because pages are too afraid to postback anyways.");
        quotes.add("Chuck Norris knows everything there is to know - Except for the definition of mercy.");
        quotes.add("Divide Chuck Norris by zero and you will in fact get one........one bad-ass that is.");
        quotes.add("Chuck Norris' unit tests don't run. They die.");
        quotes.add("The Drummer for Def Leppard's only got one arm. Chuck Norris needed a back scratcher.");
        quotes.add("Chuck Norris' programs never exit, they terminate.");
        quotes.add("Chuck Norris can write multi-threaded applications with a single thread.");
        quotes.add("Chuck Norris does not need to know about class factory pattern. He can instantiate interfaces.");
        quotes.add("If you work in an office with Chuck Norris, don't ask him for his three-hole-punch.");
        quotes.add("Chuck Norris uses tabasco sauce instead of visine.");
        quotes.add("When Chuck Norris break the build, you can't fix it, because there is not a single line of code left.");
        quotes.add("Chuck Norris can make a class that is both abstract and final.");
        quotes.add("When Chuck Norris does a pushup, he isn't lifting himself up, he's pushing the Earth down.");
        quotes.add("As an infant, Chuck Norris' parents gave him a toy hammer. He gave the world Stonehenge.");
        quotes.add("Little Miss Muffet sat on her tuffet, until Chuck Norris roundhouse kicked her into a glacier.");
        quotes.add("The quickest way to a man's heart is with Chuck Norris' fist.");
        quotes.add("Code runs faster when Chuck Norris watches it.");
        quotes.add("If you spell Chuck Norris in Scrabble, you win. Forever.");
        quotes.add("TNT was originally developed by Chuck Norris to cure indigestion.");
        quotes.add("July 4th is Independence day. And the day Chuck Norris was born. Coincidence? I think not.");
        quotes.add("In a fight between Batman and Darth Vader, the winner would be Chuck Norris.");
        quotes.add("When Chuck Norris does division, there are no remainders.");
        quotes.add("If Chuck Norris writes code with bugs, the bugs fix themselves.");
        quotes.add("Jean-Claude Van Damme once kicked Chuck Norris' ass. He was then awakened from his dream by a roundhouse kick to the face.");
        quotes.add("If you try to kill -9 Chuck Norris's programs, it backfires.");
        quotes.add("Chuck Norris can unit test entire applications with a single assert.");
        quotes.add("Chuck Norris knows the value of NULL, and he can sort by it too.");
        quotes.add("Chuck Norris invented black. In fact, he invented the entire spectrum of visible light. Except pink. Tom Cruise invented pink.");
        quotes.add("Chuck Norris can lead a horse to water AND make it drink.");
        quotes.add("Chuck Norris's first program was kill -9.");
        quotes.add("Chuck Norris once participated in the running of the bulls. He walked.");
        quotes.add("Chuck Norris's log statements are always at the FATAL level.");
        quotes.add("One time, Chuck Norris accidentally stubbed his toe. It destroyed the entire state of Ohio.");
        quotes.add("Chuck Norris doesn't chew gum. Chuck Norris chews tin foil.");
        quotes.add("If tapped, a Chuck Norris roundhouse kick could power the country of Australia for 44 minutes.");
        quotes.add("Chuck Norris doesn't churn butter. He roundhouse kicks the cows and the butter comes straight out.");
        quotes.add("Chuck Norris does not need to type-cast. The Chuck-Norris Compiler (CNC) sees through things. All way down. Always.");
        quotes.add("Chuck Norris has banned rainbows from the state of North Dakota.");
        quotes.add("Bill Gates thinks he's Chuck Norris. Chuck Norris actually laughed. Once.");
        quotes.add("Chuck Norris once ate an entire bottle of sleeping pills. They made him blink.");
        quotes.add("Chuck Norris's brain waves are suspected to be harmful to cell phones.");
        quotes.add("Aliens DO indeed exist. They just know better than to visit a planet that Chuck Norris is on.");
        quotes.add("What was going through the minds of all of Chuck Norris' victims before they died? His shoe.");
        quotes.add("Chuck Norris can write infinite recursion functions and have them return.");
        quotes.add("Chuck Norris doesn't use reflection, reflection asks politely for his help.");
        quotes.add("Chuck Norris crossed the road. No one has ever dared question his motives.");
        quotes.add("Chuck Norris puts his pants on one leg at a time, just like the rest of us. The only difference is, then he kills people.");
        quotes.add("Chuck Norris can set ants on fire with a magnifying glass. At night.");
        quotes.add("Only Chuck Norris can prevent forest fires.");
        quotes.add("Chuck Norris likes his coffee half and half: half coffee grounds, half wood-grain alcohol.");
        quotes.add("Ninjas want to grow up to be just like Chuck Norris. But usually they grow up just to be killed by Chuck Norris.");
        quotes.add("Chuck Norris's show is called Walker: Texas Ranger, because Chuck Norris doesn't run.");
        quotes.add("Simply by pulling on both ends, Chuck Norris can stretch diamonds back into coal.");
        quotes.add("It takes 14 puppeteers to make Chuck Norris smile, but only 2 to make him destroy an orphanage.");
        quotes.add("Chuck Norris brushes his teeth with a mixture of iron shavings, industrial paint remover, and wood-grain alcohol.   ");
        quotes.add("Industrial logging isn't the cause of deforestation. Chuck Norris needs toothpicks.");
        quotes.add("Chuck Norris doesn't do Burn Down charts, he does Smack Down charts.");
        quotes.add("If Chuck Norris wants your opinion, he'll beat it into you.");
        quotes.add("On his birthday, Chuck Norris randomly selects one lucky child to be thrown into the sun.");
        quotes.add("Chuck Norris doesn't bowl strikes, he just knocks down one pin and the other nine faint.");
        quotes.add("According to Einstein's theory of relativity, Chuck Norris can actually roundhouse kick you yesterday.");
        quotes.add("Chuck Norris' first job was as a paperboy. There were no survivors.");
        quotes.add("Chuck Norris does infinite loops in 4 seconds.");
        quotes.add("Chuck Norris doesn't pair program.");
        quotes.add("Paper beats rock, rock beats scissors, and scissors beats paper, but Chuck Norris beats all 3 at the same time.");
        quotes.add("Chuck Norris qualified with a top speed of 324 mph at the Daytona 500, without a car.");
        quotes.add("Count from one to ten. That's how long it would take Chuck Norris to kill you...Fourty seven times.");
        quotes.add("Chuck Norris insists on strongly-typed programming languages.");
        quotes.add("All arrays Chuck Norris declares are of infinite size, because Chuck Norris knows no bounds.");
        quotes.add("President Roosevelt once rode his horse 100 miles. Chuck Norris carried his the same distance in half the time.");
        quotes.add("Chuck Norris doesn't actually write books, the words assemble themselves out of fear.");
        quotes.add("A study showed the leading causes of death in the United States are: 1. Heart disease, 2. Chuck Norris, 3. Cancer");
        quotes.add("When Chuck Norris plays Monopoly, it affects the actual world economy.");
        quotes.add("Superman once watched an episode of Walker, Texas Ranger. He then cried himself to sleep.");
        quotes.add("Godzilla is a Japanese rendition of Chuck Norris' first visit to Tokyo.");
        quotes.add("The class object inherits from Chuck Norris");
        quotes.add("Everybody loves Raymond. Except Chuck Norris.");
        quotes.add("Chuck Norris is the reason why Waldo is hiding.");
        quotes.add("Two wrongs don't make a right. Unless you're Chuck Norris. Then two wrongs make a roundhouse kick to the face");
        quotes.add("Chuck Norris once pulled out a single hair from his beard and skewered three men through the heart with it.");
        quotes.add("Police label anyone attacking Chuck Norris as a Code 45-11.... A suicide.");
        quotes.add("Chuck Norris can slam a revolving door.");
        quotes.add("Ozzy Osbourne bites the heads off of bats. Chuck Norris bites the heads off of Siberian Tigers.");
        quotes.add("Chuck Norris could use anything in java.util.* to kill you, including the javadocs.");
        quotes.add("When Chuck Norris goes to donate blood, he declines the syringe, and instead requests a hand gun and a bucket.");
        quotes.add("Chuck Norris doesn't daydream. He's too busy giving other people nightmares.");
        quotes.add("Chuck Norris doesn't need a debugger, he just stares down the bug until the code confesses.");
        quotes.add("Sticks and stones may break your bones, but a Chuck Norris glare will liquefy your kidneys.");
        quotes.add("The First rule of Chuck Norris is: you do not talk about Chuck Norris.");
        quotes.add("Chuck Norris doesn't wear a watch, HE decides what time it is.");
        quotes.add("Chuck Norris causes the Windows Blue Screen of Death.");
        quotes.add("Chuck Norris can compile syntax errors.");
        quotes.add("Chuck Norris once kicked a horse in the chin. Its decendants are known today as Giraffes.");
        quotes.add("There are no such things as tornadoes. Chuck Norris just hates trailer parks.");
        quotes.add("Chuck Norris is the only man who has, literally, beaten the odds. With his fists.");
        quotes.add("Chuck Norris counted to infinity. Twice.");
        quotes.add("Chuck Norris can put out a fire with a gallon of gasoline.");
        quotes.add("Death once had a near-Chuck-Norris experience.");
        quotes.add("Chuck Norris can kill your imaginary friends.");
        quotes.add("Chuck Norris can hear sign language.");
        quotes.add("Chuck Norris beat the sun in a staring contest.");
        quotes.add("When Graham Bell invented the telephone, he had two missed calls from Chuck Norris");
        quotes.add("Chuck Norris doesn't flush the toilet, he scares the shit out of it.");
    }

    public String getRandomQuote(){
        return quotes.get(ThreadLocalRandom.current().nextInt(1, quotes.size()));
    }
}
