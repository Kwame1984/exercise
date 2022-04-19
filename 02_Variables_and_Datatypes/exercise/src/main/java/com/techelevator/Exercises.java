package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println(birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlaying = 3 - 2;
		System.out.println(raccoonsPlaying);


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberLessBeesThanFlowers =  numberOfFlowers - numberOfBees;
		System.out.println(numberLessBeesThanFlowers);


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		lonelyPigeon = lonelyPigeon + 1;
		System.out.println(lonelyPigeon);


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int initNumberOwlsOnFence = 3;
		int numberOfOwlsJoined = 2;
		int owlsOnFenceNow = initNumberOwlsOnFence + numberOfOwlsJoined;
		System.out.println(owlsOnFenceNow);


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int swimmingBeaver = 1;
		int beaversStillWorking = beaversWorking - swimmingBeaver;
		System.out.println(beaversStillWorking);


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucans = 2;
		int newToucan = 1;
		int toucansInAll = toucans + newToucan;
		System.out.println(toucansInAll);


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		System.out.println(squirrels - nuts);


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		nickel = nickel * 2;
		double moneyFound = (quarter + dime + nickel)  / 100.00;
		System.out.println(moneyFound);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brierMuffinCount = 18;
		int macadamsMuffinCount = 20;
		int flanneryMuffinCount = 17;
		int totalMuffinCount = brierMuffinCount + macadamsMuffinCount + flanneryMuffinCount;
		System.out.println(totalMuffinCount);


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int yoyo = 24;
		int whistle = 14;
		double spentInAll = (yoyo + whistle) / 100.00;
		System.out.println("$" + spentInAll);


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int marshmallows = 8 + 10;
		System.out.println(marshmallows);


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int inchesSnowAtHilts = 29;
		int inchesSnowAtBrecknock = 17;
		int howMuchMoreSnowAtHilts = inchesSnowAtHilts - inchesSnowAtBrecknock;
		System.out.println(howMuchMoreSnowAtHilts);


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltsMoney = 10;
		int costTruck = 3;
		int costPencilCase = 2;
		int moneyLeftHilt = hiltsMoney - costTruck - costPencilCase;
		System.out.println(moneyLeftHilt + "$");



        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marblesJosh = 16;
		int marbleslost = 7;
		int marblesLeft = marblesJosh - marbleslost;
		System.out.println("He has " + marblesLeft + " marbles left.");



        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int initialSeashellCount = 19;
		int targetSeashellCount = 25;
		int numberOfSeashellsToFind = targetSeashellCount - initialSeashellCount;
		System.out.println(numberOfSeashellsToFind);



        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradBallons = 17;
		int redBalloons = 8;
		int totalBalloons = bradBallons - redBalloons;
		System.out.println("He has " + totalBalloons + " green ballons.");


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int newBooksOnShelf = 10;
		int booksNowShelf = booksOnShelf + newBooksOnShelf;
		System.out.println(booksNowShelf);


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beesLegs = 6;
		int legsPerBee = 8;
		int eightBeesLegs = beesLegs * legsPerBee;
		System.out.println(eightBeesLegs);


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		int iceCreamConeCost = 99;
		int numberOfCones = 2;
		double costOfCones = (iceCreamConeCost * numberOfCones) / 100.00;
		System.out.println("Two cone cost " + "$" + costOfCones + ".");


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int requiredRockCount = 125;
		int currentRockCount = 64;
		int neededRockCount = requiredRockCount - currentRockCount;
		System.out.println(neededRockCount);




        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int initialHiltMarbleCount = 38;
		int lostHiltMarbleCount = 15;
		int currentHiltMarbleCount = initialHiltMarbleCount - lostHiltMarbleCount;
		System.out.println(currentHiltMarbleCount);


		//System.out.println("She has " + (38 - 15) + "marbles left.");


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int milesToConcert = 78;
		int milesBeforeStopping = 32;
		int milesLeftToDrive = milesToConcert - milesBeforeStopping;
		System.out.println(milesLeftToDrive);

		//System.out.println("They have " + (78 - 32) + "miles left.");


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int hour = 60;
		int shovSaturdayMorning = hour + 30;
		int shovSaturdayAfternoon = 45;
		int totalTimeShov = shovSaturdayMorning + shovSaturdayAfternoon;
		System.out.println("She spent " + totalTimeShov + "minutes.");


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double costHotdog = 0.5;
		double purchasedHotDogs = 6;
				double totalHotdogCost = purchasedHotDogs * costHotdog;
		System.out.println(totalHotdogCost + "$");



        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltsPencilMoney = 50;
		int pencilCost = 7;
		int totalPencilBought = hiltsPencilMoney / pencilCost;
		System.out.println(totalPencilBought);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int hiltSaw = 33 - 20;
		System.out.println(hiltSaw);


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int katesMoney = 100;
		int candyCost = 54;
		int changeBack = katesMoney - candyCost;
		System.out.println(changeBack + " cents back");


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int marksTrees = 13 + 12;
		System.out.println(marksTrees);


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int day = 24;
		int timeToGranny = day * 2;
		System.out.println(timeToGranny);


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int gumNeeded = 4 * 5;
		System.out.println(gumNeeded);


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int dansMoney = 3;
		int candybarCost = 1;
		int moneyLeftOver = dansMoney - candybarCost;
		System.out.println(moneyLeftOver + "$");


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int peopleOnBoats = 5 * 3;
		System.out.println(peopleOnBoats);


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legosEllen = 380 - 57;
		System.out.println(legosEllen);


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinMan = 83 - 35;
		System.out.println(muffinMan);



        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyWins = 1400 - 290;
		System.out.println(willyWins);


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickerMania = 22 * 10;
		System.out.println(stickerMania);


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalNumberCupCakes = 100;
		int numberKids = 8;
		int cupCakePerKid = totalNumberCupCakes / numberKids;
		System.out.println(cupCakePerKid);



        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int cookieJars = 47 % 6;
		System.out.println(cookieJars);


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int frenchBagelsNotGiven = 59 % 8;
		System.out.println(frenchBagelsNotGiven);


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int traysNeeded = 276 / 12;
		System.out.println(traysNeeded);


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzelServings = 480 / 12;
		System.out.println(pretzelServings);


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int cupcakeGiveaway = (53 - 2) / 3 ;
		System.out.println(cupcakeGiveaway);


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int uneatenCarrotSticks = 74 % 12;
		System.out.println(uneatenCarrotSticks);


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int bearsOnShelves = 98 / 7;
		System.out.println(bearsOnShelves);


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumsNeeded =480 / 20;
		System.out.println(albumsNeeded);


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCards = 94;
				int fullBox = 8;
				int boxesFilled = tradingCards / fullBox;
				int unfilledBox = tradingCards % fullBox;
						System.out.println("He filled " + boxesFilled + " and the unfilled box had " + unfilledBox + "left in it.");


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksPerShelf = 210 / 10;
		System.out.println(booksPerShelf);


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int totalNumberOfCroissants = 17;
		int totalNumberofGuests = 7;
		int croissantPerGuest = totalNumberOfCroissants / totalNumberofGuests;
		System.out.println(croissantPerGuest);


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		float billAvg = 2.15f;
		float jillAvg = 1.90f;
		int totalNumRms = 623;
		int workDayHours = 8;
		int bothAvg = (int) (((((billAvg + jillAvg)/2)/2) * totalNumRms / workDayHours) + 1);
		System.out.println("It will take Bill and Jill " + bothAvg + " days to paint 623 rooms given their average speed.");



	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Grace";
		String lastName = "Hooper";
		String middleInitial = "B.";
		String fullName = lastName + ", " + " " + firstName + " " + middleInitial;
		System.out.println(fullName);


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		float newYorkToChicagoMiles = 800f;
		float milesAlreadyTraveled = 537f;
		int percentOfTripCompleted = (int) ((milesAlreadyTraveled / newYorkToChicagoMiles)*100);
		System.out.println(percentOfTripCompleted + "%");


	}

}
