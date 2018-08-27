package com.example.lib;

import java.util.Random;

public class Joker {
    private static Random random = new Random();

    public static String getJoke() {
        int randomIndex = random.nextInt(jokeAnswers.length);
        return jokeAnswers[randomIndex];
    }
    // Answers to "Why did the chicken cross the road?" (c) 2008 by David Morin.
    // Taken from https://www.physics.harvard.edu/academics/undergrad/chickenroad
    private static String[] jokeAnswers = {
            "Albert Einstein: The chicken did not cross the road. The road passed beneath the chicken.",

            "Isaac Newton: Chickens at rest tend to stay at rest. Chickens in motion tend to cross roads.",

            "Wolfgang Pauli: There was already a chicken on this side of the road.",

            "Carl Sagan: There are billions and billions of such chickens, crossing roads just like this one, all across the universe. [Apologies for perpetuating the misquote.]",

            "Jean-Dernard-Leon Foucault: What’s interesting is that if you wait a few hours, it will be crossing the road a few inches back that way.",

            "Robert Van de Graaf: Hey, doesn’t it look funny with all its feathers sticking up like that?",

            "Albert Michelson and Edward Morley: Our experiment was a failure. We could not detect the road.",

            "Ludwig Boltzmann: If you have enough chickens, it is a near certainty that one of them will cross the road.",

            "Johannes van der Waals: Some say it was a sixth sense that led the chicken to cross the road. I say it was a sixth power.",

            "David Hilbert: I was standing on the side of the road and a chicken came along, evidently in some kind of strange state. I informed it that it was nevertheless still in my space, so it went across the road.",

            "Blaise Pascal: The chicken felt pressure on this side of the road. However, when it arrived on the other side it still felt the same pressure.",

            "John David Jackson: You’ll find out after you complete this 37-page calculation.",

            "Henri Poincare: Let’s try changing the initial position of the chicken just a tiny, tiny, tiny bit, and... look, it’s now across the road!",

            "Enrico Fermi: In estimating to the nearest power of 10 the number of chickens that cross the road, note that since fractional chickens are not allowed, the desired power must be at least zero. Therefore, at least one chicken crosses the road.",

            "Werner Heisenberg: Because I made darn sure it was standing right next to me on this side.",

            "Richard Feynman, 1: It’s all quite clear from this simple little diagram of a circle with lines poking out of it.",

            "Richard Feynman, 2: There was this good-looking rooster on the other side of the road, and he figured he’d skip all the games and just get to the point. So he asked the chicken if she’d like to come over to his side, and she said sure.",

            "Erwin Schrodinger: The chicken doesn’t cross the road. Rather, it exists simultaneously on both sides... just don’t peek.",

            "Charles Coulomb: The chicken found a similar chicken on this side of the road to be repellent.",

            "John Bell: Since there are no local hidden chickens, any hidden chickens you find must have come from far away. They therefore surely must have crossed at least one road on their way here.",

            "Henry Cavendish: My dear chicken, I have calculated with the utmost detail and precision the density of your insides. Now, for the sake of my precious sanity, I beg you, stop that incessant clucking and be gone!",

            "Arthur Compton: There were a bunch of chickens waving at me on this side of the road, but then a car came along and they all scattered to the other side. The funny thing is that the ones that ended farthest away were still waving at me a few minutes later. So apparently, the ones that scattered the most had the longest waves.",

            "Hans Geiger: I don’t know, but I say we count how many times it crosses!",

            "Howard Georgi: It can cross all it wants, but I’m going to sit here and wait until it decays.",

            "Edward Teller: I will build a more powerful chicken, and it will cross the road with more energy than any chicken before!",

            "Oskar Klein: Actually, it can get to the other side of the road without crossing it.",

            "Satyendra Bose: An identical chicken already crossed the road, so this one was much more likely to do the same.",

            "Wallace Clement Sabine: If you listen very carefully, you can hear the pitter patter of chicken feet, which implies that a chicken must be crossing the road.",

            "Sir David Brewster: Let me give you my angle on this....",

            "Galileo Galilei: The chicken crossed the road because it put one foot in front of the other and took a sufficient number of steps to traverse a distance greater than or equal to the road’s width. Note that the reason is not because the earth is the center of the universe. Oh, great... another jail term.",

            "David Gross, H. David Politzer, Frank Wilczek: The road is not wide. And at short distances a chicken is free to do whatever it wants.",

            "Robert Millikan: It didn't. It made it part way and then just sort of hovered there, apparently feeling an equal pull in both directions.",

            "Peter Higgs: We must first find the chicken.",

            "Nicolaus Copernicus: The chicken was moving at a slightly different orbital speed around the sun.",

            "Fusion researchers: Because it knew that in 30 years it would get to the other side. [No insult intended here. Well, at least not to the physicists working hard with the meager funds they've been given.]",

            "George Francis FitzGerald: It had its doubts, but after starting across the road, the chicken observed that the distance to the other side didn’t seem quite as large, so it figured it would continue on.",

            "Leo Szilard: First one chicken crossed. This then caused a few more to cross, each of which in turn caused a few more...",

            "George Atwood: The chicken wanted to introduce a setup that would enable it to pose a question and thereby torture future students over and over and over...",

            "Johannes Kepler: I don't know. But I'm glad it did, because as it waddled across, it was kind enough to sweep the area of the road with its wings. And it did so at an astonishingly consistent rate.",

            "Robert Pound and Glen Rebka: It was out for a morning jog and wanted to get its heart rate up by crossing over the crown of the road.",

            "Robert Hooke: At first, the chicken was drawn across the road. But after passing the middle, it felt an increasing desire to return to the original side. It did end up making it to the other side (just barely), but then decided to return. I believe it is still going back and forth on this.",

            "Lisa Randall: The only thing about the chicken we ever discuss is why it crossed the road. There are many more dimensions to it than that!",

            "Norman Ramsey: I don’t know why, but I do know that it took 4.71988362706153 seconds to get there.",

            "Pierre de Fermat: Forget about why. I’ll show you how it can get there in the least amount of time.",

            "Neils Bohr: In attempting to answer the question by observing the chicken, I collapsed its wavefunction to the other side.",

            "Gustav Kirchhoff: It actually crossed the road twice, due to a strange desire to form a closed loop.",

            "Louis de Broglie: Interesting, it always seems to flap its wings an integral number of times before it comes back.",

            "Michael Faraday: No, again? How many times do I have to tell it to stick to the safety of its cage?!",

            "Max Planck: It appears to be a white chicken. Sorry, I deal only with black bodies.",

            "Sir William Hamilton: With regard to the issue of crossing the road, the chicken made it to the other side by taking as little action as possible.",

            "Hugh Everett: I don’t know, but there’s another one over there that isn’t crossing the road.",

            "Edward Witten: 50 years ago, you probably would have said there was no hope of answering this question either.",

            "Archimedes: I was running through the streets yelling and screaming, and it was only afterward that I realized I was carrying a chicken.",

            "Amadeo Avogadro: What, just one? I deal only with very large chicken numbers.",

            "Ptolemy: Someone will probably think of a simpler explanation in a few thousand years, but the present understanding is that the chicken crosses the road because it is constrained to move on this here sphere, which in turn has its center on this one over here. The end result is that, except in the rare case of retrograde chicken motion, the chicken does indeed cross the road.",

            "Marie Curie: Good question. And one that is much less hazardous to one’s health.",

            "Willebrod Snell: I’m not sure, but I did notice that when it stepped onto the road, it changed its direction.",

            "Johann Carl Friedrich Gauss: Draw a pillbox around the road, and consider the flux of chickens through the box. If a chicken leaves this side of the road, then assuming that there are no chicken sinks or sources, it must end up on the other side.",

            "Johann Balmer: Why are there only two lines in the middle of the road?",

            "James Clerk Maxwell: Ok, Miss Chicken, let’s figure this out together. Hold out your right foot.... yes, that’s it.... good.... now curl your talons.... right.... now look at your.... hold on – you don’t have any thumbs!",

            "Osborne Reynolds: No idea. But I can see from the ruffled feathers that this was turbulent chicken flow.",

            "Karl Schwarzschild: The sad thing is, I know I could have answered this question too. [This one isn’t meant to be funny.]",

            "Christian Doppler: It always sounds a bit down when it’s heading over there, but rather upbeat when it’s coming back.",

            "Edwin Hubble: Strange, it seems to move faster the farther away it gets.",

            "Ernest Rutherford: The differential cross section for forward chicken scattering is quite large, so the chicken will most likely cross the road if it was initially heading in that direction.",

            "Lene Hau: Well, I wish it hadn't. It cut right in front of me while I was out for a bike ride, chatting it up with a photon.",

            "Stephen Hawking: Chicken fluctuations will inevitably create a scenario where a chicken ends up on the other side of the yellow line, in which case there is a nonzero probability that it will escape to the other side.",

            "Lord Kelvin: I don’t know. But I think the road actually starts back there a bit.",

            "Daniel Bernoulli: Because it enjoyed flying to the other side. Ok, wait, can someone tell me once and for all if I’m relevant to all this flying stuff or not?!",

            "Robert Oppenheimer: Although it was deemed appropriate at the time, people will forever question whether it was correct for the chicken to cross the road."
    };
}
