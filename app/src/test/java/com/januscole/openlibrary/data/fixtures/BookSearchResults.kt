package com.januscole.openlibrary.data.fixtures

import com.google.gson.Gson
import com.januscole.openlibrary.data.models.BookSearchResultsDTO

@Suppress("SpellCheckingInspection")
class MockBookSearchResults {

    companion object {
        const val VALID_BOOK_TITLE_SEARCH_CRITERIA = "Valid Search Criteria"
        const val VALID_BOOK_TITLE_SEARCH_TERM_1 = "Valid Search Criteria 1"
        const val INVALID_BOOK_TITLE_SEARCH_CRITERIA = "Invalid Search Criteria"
        const val VALID_BOOK_TITLE_SEARCH_TERM_2 = "Valid Search Criteria 2"
        const val VALID_BOOK_ID_SEARCH_CRITERIA = "Valid Search Criteria"
        const val VALID_BOOK_ID_SEARCH_TERM_1 = "Valid Search Criteria 1"
        const val VALID_BOOK_ID_SEARCH_TERM_2 = "Valid Search Criteria 2"
    }

    fun getMockBookSearchResults(): BookSearchResultsDTO {
        val gson = Gson()
        return gson.fromJson(BookSearchResultsJSON, BookSearchResultsDTO::class.java)
    }

    fun getEmptyMockBookSearchResults(): BookSearchResultsDTO {
        val gson = Gson()
        return gson.fromJson(BookSearchResultsJSON, BookSearchResultsDTO::class.java).copy(docs = listOf())
    }
}

@Suppress("SpellCheckingInspection")
val BookSearchResultsJSON: String = """
{
    "numFound": 473,
    "start": 0,
    "numFoundExact": true,
    "docs": [
        {
            "key": "/works/OL27448W",
            "type": "work",
            "seed": [
                "/books/OL9158246M",
                "/books/OL9177076M",
                "/books/OL7883890M",
                "/books/OL21217116M",
                "/books/OL6165495M",
                "/books/OL24200787M",
                "/books/OL5975400M",
                "/books/OL17990125M",
                "/books/OL16539692M",
                "/books/OL23795326M",
                "/books/OL5574175M",
                "/books/OL5535578M",
                "/books/OL4382055M",
                "/books/OL20943851M",
                "/books/OL16791443M",
                "/books/OL22917263M",
                "/books/OL10681058M",
                "/books/OL10681579M",
                "/books/OL21392110M",
                "/books/OL22470927M",
                "/books/OL10682160M",
                "/books/OL5237526M",
                "/books/OL24353781M",
                "/books/OL10682337M",
                "/books/OL23821472M",
                "/books/OL9129627M",
                "/books/OL9117897M",
                "/books/OL22984886M",
                "/books/OL17885449M",
                "/books/OL7465857M",
                "/books/OL20943862M",
                "/books/OL27037515M",
                "/books/OL22510662M",
                "/books/OL9228715M",
                "/books/OL10162287M",
                "/books/OL20943868M",
                "/books/OL18462275M",
                "/books/OL17912024M",
                "/books/OL9177075M",
                "/books/OL9131845M",
                "/books/OL32069148M",
                "/books/OL32069147M",
                "/books/OL22909240M",
                "/books/OL1974942M",
                "/books/OL26793280M",
                "/books/OL10697675M",
                "/books/OL15280670M",
                "/books/OL22836449M",
                "/books/OL21217131M",
                "/books/OL25175074M",
                "/books/OL16355419M",
                "/books/OL8939520M",
                "/books/OL26450492M",
                "/books/OL21217165M",
                "/books/OL22193052M",
                "/books/OL10236393M",
                "/books/OL37015716M",
                "/books/OL17063250M",
                "/books/OL7827653M",
                "/books/OL22831274M",
                "/books/OL1532643M",
                "/books/OL22572775M",
                "/books/OL21058613M",
                "/books/OL28424777M",
                "/books/OL27900942M",
                "/books/OL21171006M",
                "/books/OL8610140M",
                "/books/OL7603874M",
                "/books/OL19620537M",
                "/books/OL9131888M",
                "/books/OL12509252M",
                "/books/OL22959135M",
                "/books/OL9850389M",
                "/books/OL8269996M",
                "/books/OL9444589M",
                "/books/OL7827516M",
                "/books/OL9076613M",
                "/books/OL7468970M",
                "/books/OL7603320M",
                "/books/OL27040581M",
                "/books/OL8840204M",
                "/books/OL8171857M",
                "/books/OL9854773M",
                "/books/OL32582185M",
                "/books/OL30533953M",
                "/books/OL30537183M",
                "/books/OL29570705M",
                "/books/OL27037939M",
                "/books/OL27037940M",
                "/books/OL26825020M",
                "/books/OL26327795M",
                "/books/OL9039651M",
                "/books/OL7915576M",
                "/books/OL26418460M",
                "/books/OL7946403M",
                "/books/OL3966044M",
                "/books/OL9216449M",
                "/books/OL9559516M",
                "/books/OL31867423M",
                "/books/OL35446040M",
                "/books/OL31445871M",
                "/books/OL30941069M",
                "/books/OL24335283M",
                "/books/OL27900943M",
                "/books/OL9076563M",
                "/books/OL8373813M",
                "/books/OL9217143M",
                "/books/OL8890596M",
                "/books/OL8890612M",
                "/books/OL3659520M",
                "/books/OL22819486M",
                "/books/OL3670214M",
                "/books/OL33891821M",
                "/books/OL31905190M",
                "/books/OL12539363M",
                "/books/OL27037938M",
                "/books/OL7605129M",
                "/books/OL12823904M",
                "/books/OL3380031M",
                "/books/OL22816363M",
                "/books/OL33912545M",
                "/books/OL28428935M",
                "/books/OL15948324M",
                "/books/OL8890481M",
                "/books/OL8171984M",
                "/books/OL10943762M",
                "/books/OL3321902M",
                "/books/OL28255021M",
                "/books/OL12539421M",
                "/books/OL27039287M",
                "/books/OL9218752M",
                "/books/OL3404981M",
                "/books/OL25424621M",
                "/books/OL32050940M",
                "/books/OL28182804M",
                "/books/OL27071765M",
                "/books/OL24278639M",
                "/books/OL24261347M",
                "/books/OL32225404M",
                "/books/OL31952532M",
                "/books/OL27037501M",
                "/books/OL26885115M",
                "/books/OL26450452M",
                "/books/OL27040235M",
                "/books/OL27040883M",
                "/books/OL26092341M",
                "/books/OL27039300M",
                "/books/OL27048930M",
                "/books/OL25418752M",
                "/books/OL27037516M",
                "/books/OL27394469M",
                "/books/OL31973640M",
                "/books/OL31462764M",
                "/books/OL32531171M",
                "/books/OL34777192M",
                "/books/OL34167892M",
                "/books/OL33915836M",
                "/works/OL27448W",
                "/subjects/the_lord_of_the_rings",
                "/subjects/fiction",
                "/subjects/ficci\u00f3n",
                "/subjects/english_fantasy_fiction",
                "/subjects/ficci\u00f3n_fant\u00e1stica_inglesa",
                "/subjects/fantasy_fiction",
                "/subjects/fiction_in_english",
                "/subjects/open_library_staff_picks",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/fiction_fantasy_epic",
                "/subjects/middle_earth_(imaginary_place)_fiction",
                "/subjects/baggins_frodo_(fictitious_character)_fiction",
                "/subjects/gandalf_(fictitious_character)_fiction",
                "/subjects/british_and_irish_fiction_(fictional_works_by_one_author)",
                "/subjects/english_literature",
                "/subjects/frodo_baggins_(fictitious_character)",
                "/subjects/baggins_bilbo_(fictitious_character)_fiction",
                "/subjects/fiction_fantasy_general",
                "/subjects/english_language",
                "/subjects/fiction_media_tie-in",
                "/subjects/gift_books",
                "/subjects/quests_(expeditions)",
                "/subjects/wizards",
                "/subjects/terre_du_milieu_(lieu_imaginaire)",
                "/subjects/romans_nouvelles",
                "/subjects/qu\u00eate",
                "/subjects/person:frodo_baggins",
                "/subjects/person:samwise_gamgee",
                "/subjects/person:meriadoc_brandybuck",
                "/subjects/person:peregrin_took",
                "/subjects/person:gandalf_the_grey",
                "/subjects/person:aragorn",
                "/subjects/person:legolas_greenleaf",
                "/subjects/person:gimli",
                "/subjects/person:boromir",
                "/subjects/person:denethor",
                "/subjects/person:faramir",
                "/subjects/person:galadriel",
                "/subjects/person:celeborn",
                "/subjects/person:elrond",
                "/subjects/person:arwen_und\u00f3miel",
                "/subjects/person:bilbo_baggins",
                "/subjects/person:th\u00e9oden",
                "/subjects/person:\u00e9omer",
                "/subjects/person:\u00e9owyn",
                "/subjects/person:treebeard",
                "/subjects/person:tom_bombadil",
                "/subjects/person:king_thranduil",
                "/subjects/person:silvan_elves",
                "/subjects/person:sauron",
                "/subjects/person:elves_of_eregion",
                "/subjects/person:the_nazg\u00fbl",
                "/subjects/person:the_witch-king_of_angmar",
                "/subjects/person:saruman_the_white",
                "/subjects/person:gr\u00edma_wormtongue",
                "/subjects/person:gollum",
                "/subjects/person:shelob",
                "/subjects/person:durin's_bane",
                "/subjects/person:mouth_of_sauron",
                "/subjects/place:mordor",
                "/subjects/place:hornburg",
                "/subjects/place:isengard",
                "/subjects/place:cracks_of_doom",
                "/subjects/place:fangorn_forest",
                "/subjects/place:middle_earth",
                "/subjects/place:tierra_media",
                "/subjects/time:the_end_of_the_third_age",
                "/authors/OL26320A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 157,
            "edition_key": [
                "OL9158246M",
                "OL9177076M",
                "OL7883890M",
                "OL21217116M",
                "OL6165495M",
                "OL24200787M",
                "OL5975400M",
                "OL17990125M",
                "OL16539692M",
                "OL23795326M",
                "OL5574175M",
                "OL5535578M",
                "OL4382055M",
                "OL20943851M",
                "OL16791443M",
                "OL22917263M",
                "OL10681058M",
                "OL10681579M",
                "OL21392110M",
                "OL22470927M",
                "OL10682160M",
                "OL5237526M",
                "OL24353781M",
                "OL10682337M",
                "OL23821472M",
                "OL9129627M",
                "OL9117897M",
                "OL22984886M",
                "OL17885449M",
                "OL7465857M",
                "OL20943862M",
                "OL27037515M",
                "OL22510662M",
                "OL9228715M",
                "OL10162287M",
                "OL20943868M",
                "OL18462275M",
                "OL17912024M",
                "OL9177075M",
                "OL9131845M",
                "OL32069148M",
                "OL32069147M",
                "OL22909240M",
                "OL1974942M",
                "OL26793280M",
                "OL10697675M",
                "OL15280670M",
                "OL22836449M",
                "OL21217131M",
                "OL25175074M",
                "OL16355419M",
                "OL8939520M",
                "OL26450492M",
                "OL21217165M",
                "OL22193052M",
                "OL10236393M",
                "OL37015716M",
                "OL17063250M",
                "OL7827653M",
                "OL22831274M",
                "OL1532643M",
                "OL22572775M",
                "OL21058613M",
                "OL28424777M",
                "OL27900942M",
                "OL21171006M",
                "OL8610140M",
                "OL7603874M",
                "OL19620537M",
                "OL9131888M",
                "OL12509252M",
                "OL22959135M",
                "OL9850389M",
                "OL8269996M",
                "OL9444589M",
                "OL7827516M",
                "OL9076613M",
                "OL7468970M",
                "OL7603320M",
                "OL27040581M",
                "OL8840204M",
                "OL8171857M",
                "OL9854773M",
                "OL32582185M",
                "OL30533953M",
                "OL30537183M",
                "OL29570705M",
                "OL27037939M",
                "OL27037940M",
                "OL26825020M",
                "OL26327795M",
                "OL9039651M",
                "OL7915576M",
                "OL26418460M",
                "OL7946403M",
                "OL3966044M",
                "OL9216449M",
                "OL9559516M",
                "OL31867423M",
                "OL35446040M",
                "OL31445871M",
                "OL30941069M",
                "OL24335283M",
                "OL27900943M",
                "OL9076563M",
                "OL8373813M",
                "OL9217143M",
                "OL8890596M",
                "OL8890612M",
                "OL3659520M",
                "OL22819486M",
                "OL3670214M",
                "OL33891821M",
                "OL31905190M",
                "OL12539363M",
                "OL27037938M",
                "OL7605129M",
                "OL12823904M",
                "OL3380031M",
                "OL22816363M",
                "OL33912545M",
                "OL28428935M",
                "OL15948324M",
                "OL8890481M",
                "OL8171984M",
                "OL10943762M",
                "OL3321902M",
                "OL28255021M",
                "OL12539421M",
                "OL27039287M",
                "OL9218752M",
                "OL3404981M",
                "OL25424621M",
                "OL32050940M",
                "OL28182804M",
                "OL27071765M",
                "OL24278639M",
                "OL24261347M",
                "OL32225404M",
                "OL31952532M",
                "OL27037501M",
                "OL26885115M",
                "OL26450452M",
                "OL27040235M",
                "OL27040883M",
                "OL26092341M",
                "OL27039300M",
                "OL27048930M",
                "OL25418752M",
                "OL27037516M",
                "OL27394469M",
                "OL31973640M",
                "OL31462764M",
                "OL32531171M",
                "OL34777192M",
                "OL34167892M",
                "OL33915836M"
            ],
            "publish_date": [
                "January 2002",
                "Jun 14, 2005",
                "1977",
                "1977/1980",
                "September 2000",
                "Sep 30, 2001",
                "2001",
                "1980",
                "1967",
                "2012",
                "1992",
                "Jun 30, 2000",
                "September 14, 1981",
                "February 1985",
                "Barcelona, 2006",
                "2009",
                "2004",
                "Sep 02, 2001",
                "Oct 25, 2017",
                "December 1, 1999",
                "1969",
                "September 1, 1993",
                "2002",
                "February 2001",
                "2003?",
                "Jan 01, 1979",
                "Jun 30, 2001",
                "January 5, 1998",
                "October 2001",
                "2021",
                "Oct 01, 2001",
                "2018",
                "1954",
                "1970",
                "2007",
                "1974",
                "2000",
                "xxxx",
                "1973",
                "Sep 30, 2002",
                "2001 August",
                "1981",
                "1985",
                "Aug 19, 2008",
                "June 1994",
                "1991",
                "September 20, 2000",
                "May 19, 1981",
                "Aug 31, 2001",
                "Oct 15, 2016",
                "Oct 07, 2002",
                "July 1, 2003",
                "1982",
                "September 12, 1972",
                "Aug 31, 2002",
                "Nov 02, 2021",
                "1975",
                "2014",
                "Mar 03, 1988",
                "1999",
                "1968",
                "July 1995",
                "April 30, 2004",
                "December 31, 1995",
                "March 12, 1999",
                "October 28, 1978",
                "2001?",
                "January 1, 2004",
                "1999 October",
                "November 2, 1998",
                "1994",
                "November 19, 2003",
                "August 1996",
                "1978",
                "2003",
                "Jul 11, 2012",
                "Feb 15, 2012",
                "2005",
                "Jun 30, 2012",
                "1993",
                "1996",
                "Jul 02, 2013",
                "1966",
                "Oct 29, 2013",
                "1990",
                "September 1, 1991",
                "Jun 26, 2012",
                "October 16, 2002",
                "Nov 28, 2002",
                "January 1, 2002",
                "Jun 01, 2005",
                "Oct 06, 2020",
                "Aug 31, 1991",
                "Nov 03, 2020",
                "1970 September",
                "1965",
                "March 2004"
            ],
            "publish_year": [
                2005,
                2006,
                1972,
                2021,
                1977,
                2018,
                1954,
                1970,
                1993,
                1982,
                2007,
                1996,
                1974,
                2020,
                2000,
                1975,
                2001,
                1980,
                2008,
                1966,
                2013,
                2014,
                1967,
                2012,
                2017,
                1973,
                1992,
                1990,
                1999,
                1968,
                1979,
                1981,
                1985,
                2009,
                2004,
                2016,
                1969,
                1995,
                1994,
                1998,
                2002,
                1988,
                1991,
                1978,
                1965,
                2003
            ],
            "first_publish_year": 1954,
            "number_of_pages_median": 1193,
            "lccn": [
                "90215588",
                "2004275215",
                "78873439",
                "67084547",
                "2002726623",
                "91010298",
                "2004541379",
                "2001271127",
                "2002524228",
                "2005020460",
                "75308399",
                "67012274",
                "66000953",
                "54036398",
                "99026007"
            ],
            "publish_place": [
                "Norwalk, Conn",
                "Italy",
                "Barcelona",
                "Warszawa, Poland",
                "Sweden",
                "Stuttgart",
                "Sankt-Peterburg",
                "Spain",
                "Moskva",
                "Boston, MA",
                "London",
                "Baku",
                "London (etc.)",
                "New York, USA",
                "Boston, Mass",
                "Bratislava",
                "New York",
                "Barcelona, Espa\u00f1a",
                "Cangas do Morrazo (Pontevedra)",
                "To\u0304kyo\u0304",
                "Milano",
                "Boston",
                "Toronto",
                "Utrecht [etc.]",
                "Glasgow",
                "Boston, USA"
            ],
            "oclc": [
                "1070386544",
                "31385942",
                "1037246581",
                "237889032",
                "48130922",
                "51930028",
                "42949158",
                "751515201",
                "1487587",
                "232126584",
                "54848924",
                "1057087697",
                "635814336",
                "62257844",
                "1490093",
                "25273043",
                "23652961",
                "31385967",
                "63195661",
                "1030692765",
                "45573912",
                "39032585",
                "1117401267",
                "919902149",
                "41049708",
                "221689614",
                "463743014",
                "48428179",
                "1011061831",
                "51603388",
                "56605802",
                "793573297",
                "1036689097",
                "50854192",
                "779050211",
                "54432689",
                "781923736",
                "8733571",
                "61130759",
                "822969356",
                "36422414",
                "57241599",
                "56800229"
            ],
            "contributor": [
                "Lee, Alan.",
                "Dramatization (Narrator)",
                "Lee, Alan, 1947-",
                "Seta, Teiji, 1916-",
                "Ian Holm (Narrator)",
                "Rob Inglis (Narrator)",
                "Brian Sibley (Narrator)",
                "Ko\u0159\u00ednek, Otakar, 1946-",
                "Tolkien, J. R. R. 1892-1973.",
                "Rob Inglis (Narrator, Reader)",
                "Tanaka, Akiko."
            ],
            "lcc": [
                "PR-6039.00000000.O32 L617 1993",
                "PR-6039.00000000.O32 Lo3",
                "PR-6039.00000000.O32 L6 1994",
                "PR-6039.00000000.O32L6 2001",
                "PR-6039.00000000.O32 L6 1967",
                "PR-6039.00000000.O32 L6 1990",
                "PR-6039.00000000.O32L6 2003b",
                "PR-6039.00000000.O32L6 2002a",
                "PR-6039.00000000.O32 L6 2002b",
                "PR-6039.00000000.O32",
                "PR-6039.00000000.O32 L6 2001",
                "PZ-0003.00000000.T576Lo10",
                "PR-6039.00000000.O32L6 1991",
                "PR-6039.00000000.O32 Lo10",
                "PZ-0003.00000000.T576 Lo10",
                "PR-6039.00000000.O32 Lo6",
                "PR-6039.00000000.O32 L6 2004",
                "PR-6039.00000000.O32 L6 1999",
                "PR-6039.00000000.O32L6 2002",
                "PR-6039.00000000.O32L6 2004",
                "PR-6039.00000000.O32L6",
                "PR-6039.00000000.O32 Lo",
                "PZ-0003.00000000.T576 Lo3",
                "PR-6039.00000000.O32 L6 2003b",
                "PZ-0003.00000000.T576 Lo",
                "PE-0000.00000000",
                "PZ-0003.00000000.T576 Lo4",
                "PR-6039.00000000.O32 L6 2002",
                "PR-6039.00000000.O32L6 1999",
                "PR-6039.00000000.O32 L6 1993",
                "PR-6039.00000000.O32L6 2005",
                "PZ-0003.00000000.T576 Lo6",
                "PR-6039.00000000.O32 Lo4",
                "PR-6039.00000000.O32 L6 2005"
            ],
            "ddc": [
                "823.91",
                "823.914",
                "823.912"
            ],
            "isbn": [
                "0345339703",
                "9780618129027",
                "9780618260249",
                "9785768402105",
                "5170186150",
                "0048232009",
                "0586215751",
                "0618574999",
                "9780395272206",
                "2266127454",
                "807145608X",
                "0345339711",
                "9780395489314",
                "9785040081769",
                "9780606305648",
                "9780395489338",
                "0007149131",
                "0395193958",
                "9788435002608",
                "9780586215753",
                "1559351209",
                "1565115503",
                "9783608960358",
                "9788445071793",
                "9780544003415",
                "9788445073759",
                "0618517650",
                "0395974682",
                "9780007149131",
                "9781565115507",
                "9780618129010",
                "8422616335",
                "0618260250",
                "9780395974681",
                "9780618401215",
                "9788422616337",
                "0395272203",
                "0007123817",
                "0061952877",
                "9780007203635",
                "9788845210273",
                "9784566023673",
                "9780345339713",
                "9780345020208",
                "9785170188451",
                "9780395193952",
                "5352003124",
                "0395595118",
                "841688417X",
                "9784566023628",
                "8020409262",
                "9785878600132",
                "3608936394",
                "9783608958553",
                "9782266127455",
                "8377582554",
                "0395647401",
                "9788845294778",
                "3895840432",
                "9545850663",
                "8445073753",
                "9781602834927",
                "9780358439196",
                "9780828867665",
                "0261102435",
                "0345214528",
                "9780007141326",
                "9789027481979",
                "006191780X",
                "9780261103207",
                "4566023699",
                "9783608932225",
                "0345020200",
                "8435002780",
                "9780061952876",
                "9780395308554",
                "9780345247865",
                "3608932224",
                "9780618153961",
                "9780007525546",
                "9788071456063",
                "9788422690306",
                "0618260242",
                "9780007322596",
                "0048231495",
                "9784566023680",
                "9027481970",
                "9780547951942",
                "9780553472288",
                "2267013169",
                "9780007182367",
                "0563528885",
                "9780007489978",
                "0618645616",
                "9782744147777",
                "9780618574995",
                "9788071456070",
                "9780358653035",
                "9780395272213",
                "9782266032483",
                "000714914X",
                "0007322593",
                "9780007124015",
                "4566023664",
                "9788377582558",
                "9781402505201",
                "9780898452235",
                "9780395489307",
                "9780345339706",
                "8533619626",
                "8071456071",
                "0007172001",
                "9780345214522",
                "0618153969",
                "4566023702",
                "2266032488",
                "9780395272237",
                "0544003411",
                "034524222X",
                "9780007488360",
                "5768402098",
                "0261102958",
                "9788818123692",
                "9783608936391",
                "8818123696",
                "8445070339",
                "3608935444",
                "9780544273443",
                "0008471290",
                "9784566023666",
                "9780261102439",
                "9780007149247",
                "0007525540",
                "9782070544332",
                "9789545850660",
                "9780618153978",
                "4566023621",
                "9784566023659",
                "4566023737",
                "9784566023635",
                "0345339738",
                "4566023680",
                "9789510132081",
                "0048230871",
                "9780358386599",
                "1402505205",
                "9781611748864",
                "360896035X",
                "9785170186150",
                "9788435002011",
                "2070544338",
                "9780061917813",
                "0618640150",
                "9781470326746",
                "9784566023734",
                "039564738X",
                "9780618517657",
                "9780261102309",
                "5170188455",
                "9780007172009",
                "0358653037",
                "0007581149",
                "9780007581146",
                "9788445070338",
                "9780563528883",
                "8435002608",
                "9780261103252",
                "0261102419",
                "576840211X",
                "1611748747",
                "0553472283",
                "8818123211",
                "9780395489321",
                "9784566023642",
                "9780261102347",
                "9780345242228",
                "9780008471286",
                "0606305645",
                "9789113012438",
                "9780048232007",
                "9780618260256",
                "9781402516276",
                "000748836X",
                "9780395647394",
                "9780618645619",
                "5878600145",
                "8445070320",
                "9780007149148",
                "1402516274",
                "8435002020",
                "039548930X",
                "0828867666",
                "8422690306",
                "5878600137",
                "2267011255",
                "9780828818124",
                "9113012436",
                "5710000612",
                "951013208X",
                "9788071456087",
                "9780048230874",
                "4566023648",
                "0007141327",
                "9780008471293",
                "0553456539",
                "9780586218693",
                "5768402128",
                "9782267011258",
                "0828818126",
                "0007124015",
                "0061917818",
                "9785768402129",
                "0618153977",
                "1470326744",
                "9785878600149",
                "0544273443",
                "0261102346",
                "8445071793",
                "9783895840432",
                "8071456063",
                "9783608952117",
                "4566023656",
                "9785352003121",
                "9780618640157",
                "0547951949",
                "9783608935448",
                "9780618260584",
                "9780739408254",
                "9780553456530",
                "4566023672",
                "0395489326",
                "9780261102385",
                "004823091X",
                "9780807286081",
                "0618129022",
                "9780261102415",
                "9780618037667",
                "0261103253",
                "9780395595114",
                "0618401210",
                "0007182368",
                "0395489334",
                "274414777X",
                "360895211X",
                "9788416884179",
                "0261102389",
                "9780261102958",
                "160283492X",
                "9780061917806",
                "0586218696",
                "0618129014",
                "9785768402112",
                "0618343997",
                "9780048231499",
                "0007149247",
                "9780618343997",
                "0345247868",
                "0618346244",
                "456602363X",
                "0395272238",
                "0261102303",
                "0739408259",
                "9781559351201",
                "0358386594",
                "9788445070321",
                "9780048230911",
                "0007136587",
                "9780618346240",
                "9780785918691",
                "1611748860",
                "9780007136582",
                "0261103202",
                "0008471282",
                "039527222X",
                "0395647398",
                "9785768402099",
                "0618260587",
                "9784566023697",
                "9788020409263",
                "8845210278",
                "0395489318",
                "9782267013160",
                "9788435002028",
                "5768402101",
                "8845294773",
                "0358439191",
                "0007203632",
                "0007489978",
                "0807286087",
                "0618037667",
                "9780395647387",
                "9780395272220",
                "360895855X",
                "9780345339737",
                "9785710000618",
                "0898452236",
                "9788435002783",
                "0395272211",
                "8435002012",
                "0395308550",
                "9781611748741",
                "9780395647400",
                "9780007123810",
                "9788818123210",
                "9788533619623",
                "0785918698",
                "9784566023703",
                "5040081766"
            ],
            "last_modified_i": 1680770052,
            "ebook_count_i": 17,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofrings0000tolk_k7n1",
                "shinpanyubiwamon0005tolk",
                "vlastelinkolets0000tolk_w7m9",
                "lordofrings0000tolk_o3c6",
                "lordofrings0000tolk_b2r2",
                "lordofrings0000tolk_n6w1",
                "lordofrings0000tolk_d5h0",
                "lordofrings00tolk_1",
                "lordofringstrilo00jrrt",
                "lordofringsonevo00jrrt",
                "lordofrings00tolk_0",
                "lordofrings00tolk_2",
                "lordofrings00tolk_3",
                "isbn_9780618343997",
                "isbn_9780618640157",
                "lordringsthanniv00tolk",
                "osenordosaneis0000tolk"
            ],
            "ia_collection": [
                "americana",
                "bannedbooks",
                "barryuniversity-ol",
                "binghamton-ol",
                "bpljordan-ol",
                "china",
                "cnusd-ol",
                "cua-ol",
                "delawarecountydistrictlibrary",
                "inlibrary",
                "internetarchivebooks",
                "librarygenesis",
                "printdisabled",
                "riceuniversity-ol",
                "rochester-ol",
                "the-claremont-colleges-ol",
                "uiucdisabilityresources",
                "unb-ol",
                "uni-ol"
            ],
            "ia_collection_s": "americana;bannedbooks;barryuniversity-ol;binghamton-ol;bpljordan-ol;china;cnusd-ol;cua-ol;delawarecountydistrictlibrary;inlibrary;internetarchivebooks;librarygenesis;printdisabled;riceuniversity-ol;rochester-ol;the-claremont-colleges-ol;uiucdisabilityresources;unb-ol;uni-ol",
            "lending_edition_s": "OL5237526M",
            "lending_identifier_s": "lordofrings0000tolk_k7n1",
            "printdisabled_s": "OL5237526M;OL16355419M;OL37015716M;OL22831274M;OL7603874M;OL33891821M;OL31905190M;OL21058613M;OL27900942M;OL7468970M;OL3966044M;OL27900943M;OL3659520M;OL27037938M;OL3404981M;OL27071765M;OL31973640M",
            "ratings_average": 4.515625,
            "ratings_sortable": 4.187377,
            "ratings_count": 64,
            "ratings_count_1": 2,
            "ratings_count_2": 2,
            "ratings_count_3": 6,
            "ratings_count_4": 5,
            "ratings_count_5": 49,
            "readinglog_count": 1356,
            "want_to_read_count": 1160,
            "currently_reading_count": 90,
            "already_read_count": 106,
            "cover_edition_key": "OL21058613M",
            "cover_i": 9255566,
            "publisher": [
                "Kont\u0361sern \"Olimp\"",
                "Collins",
                "Der H\u00f6rverlag",
                "Allenand Unwin",
                "Houghton Mifflin Harcourt",
                "HighBridge Audio",
                "SFBC",
                "Unwin Paperbacks",
                "Houghton Mifflin Company",
                "Caedmon",
                "Highbridge Audio",
                "WSOY",
                "Ballantine",
                "HarperCollins Publishers Ltd",
                "Hyo\u0304ronsha",
                "Allen & Unwin",
                "Christian Bourgois",
                "Klett-Cotta Verlag",
                "Soundelux Audio Publishing",
                "RUSCONI",
                "BBC Books",
                "George Allen & Unwin Ltd.",
                "Highbridge Company",
                "Mariner Books",
                "Gallimard",
                "J.G. Cotta'sche, Buchhandlung Nachfolger GmbH",
                "Bard",
                "Allen and Unwin",
                "Brand: HighBridge Company",
                "Recorded Books",
                "Folio Society",
                "\"Terra\"",
                "Editions France Loisirs",
                "HarperCollins Canada, Limited",
                "\"Azbuka\"",
                "French & European Pubns",
                "Grafton",
                "Norstedt",
                "Listening Library",
                "Mlad\u00e1 fronta",
                "Het Spectrum",
                "Recorded Books, Inc.",
                "Pocket",
                "Methuen",
                "Guild",
                "Bompiani",
                "Rusconi",
                "Book Club Association",
                "Minotauro",
                "HMH Books for Young Readers",
                "Klett-Cotta",
                "Azbuka Klassika",
                "Recorded Books Unabridged",
                "HARPERCOLLINS PUBLISHERS",
                "Houghton Mifflin",
                "Slovart",
                "European Schoolbooks",
                "Circulo de Lectores",
                "HarperCollins",
                "Turtleback Books Distributed by Demco Media",
                "Harper Collins Publishers  Stock Account",
                "SP Interprint",
                "HarperCollins Publishers Limited",
                "Presse Pocket",
                "POCKET",
                "Sushi Books",
                "Ballantine Books",
                "Random House Audio",
                "BBC Audiobooks",
                "Harpercollins Pub Ltd",
                "Houghton Mifflin Co.",
                "MUZA",
                "Easton Press",
                "Unwin Hyman",
                "\"Kniga\"",
                "AST",
                "George Allen and Unwin",
                "HarperCollins Publishers",
                "Harper Collins",
                "Harpercollins"
            ],
            "language": [
                "eng",
                "ita",
                "dut",
                "spa",
                "rus",
                "ger",
                "jpn",
                "fre",
                "bul",
                "slo",
                "cze",
                "swe",
                "pol",
                "gag"
            ],
            "author_key": [
                "OL26320A"
            ],
            "author_name": [
                "J.R.R. Tolkien"
            ],
            "author_alternative_name": [
                "John Ronald Reuel Tolkien",
                "J. R. R. Tolkein",
                "J.R.R. Tolkein",
                "J. R. R. Tolkien",
                "Dzhon R. R. Tolkin",
                "Yue Han Luo Na De Rui Er Tuo Er Jin"
            ],
            "person": [
                "Frodo Baggins",
                "Samwise Gamgee",
                "Meriadoc Brandybuck",
                "Peregrin Took",
                "Gandalf the Grey",
                "Aragorn",
                "Legolas Greenleaf",
                "Gimli",
                "Boromir",
                "Denethor",
                "Faramir",
                "Galadriel",
                "Celeborn",
                "Elrond",
                "Arwen Und\u00f3miel",
                "Bilbo Baggins",
                "Th\u00e9oden",
                "\u00c9omer",
                "\u00c9owyn",
                "Treebeard",
                "Tom Bombadil",
                "King Thranduil",
                "Silvan Elves",
                "Sauron",
                "Elves of Eregion",
                "the Nazg\u00fbl",
                "The Witch-king of Angmar",
                "Saruman the White",
                "Gr\u00edma Wormtongue",
                "Gollum",
                "Shelob",
                "Durin's Bane",
                "Mouth of Sauron"
            ],
            "place": [
                "Mordor",
                "Hornburg",
                "Isengard",
                "Cracks of Doom",
                "Fangorn Forest",
                "Middle Earth",
                "Tierra Media"
            ],
            "subject": [
                "The Lord of the Rings",
                "Fiction",
                "Ficci\u00f3n",
                "English Fantasy fiction",
                "Ficci\u00f3n fant\u00e1stica inglesa",
                "Fantasy fiction",
                "Fiction in English",
                "Open Library Staff Picks",
                "Middle Earth (Imaginary place)",
                "Fiction, fantasy, epic",
                "Middle earth (imaginary place), fiction",
                "Baggins, frodo (fictitious character), fiction",
                "Gandalf (fictitious character), fiction",
                "British and irish fiction (fictional works by one author)",
                "English literature",
                "Frodo Baggins (Fictitious character)",
                "Baggins, bilbo (fictitious character), fiction",
                "Fiction, fantasy, general",
                "English language",
                "Fiction, media tie-in",
                "Gift books",
                "Quests (Expeditions)",
                "Wizards",
                "Terre du Milieu (Lieu imaginaire)",
                "Romans, nouvelles",
                "Qu\u00eate"
            ],
            "time": [
                "The end of the third age"
            ],
            "id_alibris_id": [
                "9780618260256",
                "9780618343997",
                "9780618640157",
                "9780395974681",
                "9780618129027"
            ],
            "id_amazon": [
                "",
                "841688417X",
                "0618260250",
                "0739408259",
                "0618343997",
                "8845294773",
                "0618640150",
                "0395974682",
                "0618129022"
            ],
            "id_canadian_national_library_archive": [
                "20600075"
            ],
            "id_dep\u00f3sito_legal": [
                "B 7789-1980",
                "B 41158-1979",
                "B 7642-1980",
                "B472882001"
            ],
            "id_goodreads": [
                "77683",
                "77684",
                "77685",
                "70991",
                "1110276",
                "1110277",
                "529015",
                "57127949",
                "63362",
                "2049468",
                "2049469",
                "1563843",
                "1563847",
                "1694981",
                "1694979",
                "1563845",
                "1563844",
                "1563842",
                "1563840",
                "1563841",
                "2499249",
                "516970",
                "7349",
                "18510",
                "18511",
                "18512",
                "706457",
                "2142852",
                "2745011",
                "120752",
                "1412028",
                "3697852",
                "2145536",
                "1960323",
                "227234",
                "877754",
                "222953",
                "15350",
                "15366",
                "899772",
                "325147",
                "39",
                "671212",
                "286410",
                "7353",
                "222954",
                "56895207",
                "15243",
                "6582377",
                "2693340",
                "15317",
                "1110294",
                "189560",
                "273440",
                "1811086",
                "1597667",
                "6768611",
                "984757",
                "984752",
                "4543827",
                "136774",
                "514235",
                "998763",
                "70996",
                "899781",
                "31",
                "795109",
                "2527331",
                "516989",
                "33",
                "899773",
                "32",
                "1337450",
                "5899",
                "93937",
                "340381",
                "2068966",
                "273437",
                "44172570",
                "877732",
                "899800",
                "899801",
                "35",
                "569465",
                "837605",
                "6215547",
                "3094606",
                "215342",
                "733999",
                "15407",
                "827763"
            ],
            "id_google": [
                "V3lsKdY7X8MC",
                "1lCCtAEACAAJ",
                "geAU_jMC7UUC",
                "RjiTPwAACAAJ",
                "WYeYQgAACAAJ",
                "BiCqPwAACAAJ"
            ],
            "id_librarything": [
                "3203347",
                "1386651",
                "3206242",
                "636553",
                "4881",
                "1698841",
                "1471210"
            ],
            "id_overdrive": [
                "417C4314-2354-4092-96A7-DB3C12598E8A",
                "2CCA69FD-FE09-4C2C-8C91-84D55F4AA425"
            ],
            "id_paperback_swap": [
                "0618343997",
                "0395974682",
                "0618129022"
            ],
            "id_wikidata": [
                "Q22122681"
            ],
            "ia_loaded_id": [
                "lordofrings00tolk_3",
                "twotowersbeingse1970tolk",
                "lordofrings00tolk_4",
                "lordofrings00tolk_0",
                "lordofrings00tolk_1"
            ],
            "ia_box_id": [
                "IA1156820",
                "IA40203216",
                "IA1912206",
                "IA40056508",
                "IA40092720",
                "IA40732006",
                "IA177301",
                "IA105904",
                "IA1148709",
                "IA108116",
                "IA40786115",
                "IA104013",
                "IA120120329-BL1",
                "IA177101",
                "IA40741615",
                "IA180001",
                "IA129901",
                "IA1897422",
                "IA176701"
            ],
            "publisher_facet": [
                "\"Azbuka\"",
                "\"Kniga\"",
                "\"Terra\"",
                "AST",
                "Allen & Unwin",
                "Allen and Unwin",
                "Allenand Unwin",
                "Azbuka Klassika",
                "BBC Audiobooks",
                "BBC Books",
                "Ballantine",
                "Ballantine Books",
                "Bard",
                "Bompiani",
                "Book Club Association",
                "Brand: HighBridge Company",
                "Caedmon",
                "Christian Bourgois",
                "Circulo de Lectores",
                "Collins",
                "Der H\u00f6rverlag",
                "Easton Press",
                "Editions France Loisirs",
                "European Schoolbooks",
                "Folio Society",
                "French & European Pubns",
                "Gallimard",
                "George Allen & Unwin Ltd.",
                "George Allen and Unwin",
                "Grafton",
                "Guild",
                "HARPERCOLLINS PUBLISHERS",
                "HMH Books for Young Readers",
                "Harper Collins",
                "Harper Collins Publishers  Stock Account",
                "HarperCollins",
                "HarperCollins Canada, Limited",
                "HarperCollins Publishers",
                "HarperCollins Publishers Limited",
                "HarperCollins Publishers Ltd",
                "Harpercollins",
                "Harpercollins Pub Ltd",
                "Het Spectrum",
                "HighBridge Audio",
                "Highbridge Audio",
                "Highbridge Company",
                "Houghton Mifflin",
                "Houghton Mifflin Co.",
                "Houghton Mifflin Company",
                "Houghton Mifflin Harcourt",
                "Hyo\u0304ronsha",
                "J.G. Cotta'sche, Buchhandlung Nachfolger GmbH",
                "Klett-Cotta",
                "Klett-Cotta Verlag",
                "Kont\u0361sern \"Olimp\"",
                "Listening Library",
                "MUZA",
                "Mariner Books",
                "Methuen",
                "Minotauro",
                "Mlad\u00e1 fronta",
                "Norstedt",
                "POCKET",
                "Pocket",
                "Presse Pocket",
                "RUSCONI",
                "Random House Audio",
                "Recorded Books",
                "Recorded Books Unabridged",
                "Recorded Books, Inc.",
                "Rusconi",
                "SFBC",
                "SP Interprint",
                "Slovart",
                "Soundelux Audio Publishing",
                "Sushi Books",
                "Turtleback Books Distributed by Demco Media",
                "Unwin Hyman",
                "Unwin Paperbacks",
                "WSOY"
            ],
            "person_key": [
                "aragorn",
                "arwen_und\u00f3miel",
                "bilbo_baggins",
                "boromir",
                "celeborn",
                "denethor",
                "durin's_bane",
                "elrond",
                "elves_of_eregion",
                "faramir",
                "frodo_baggins",
                "galadriel",
                "gandalf_the_grey",
                "gimli",
                "gollum",
                "gr\u00edma_wormtongue",
                "king_thranduil",
                "legolas_greenleaf",
                "meriadoc_brandybuck",
                "mouth_of_sauron",
                "peregrin_took",
                "samwise_gamgee",
                "saruman_the_white",
                "sauron",
                "shelob",
                "silvan_elves",
                "the_nazg\u00fbl",
                "the_witch-king_of_angmar",
                "th\u00e9oden",
                "tom_bombadil",
                "treebeard",
                "\u00e9omer",
                "\u00e9owyn"
            ],
            "place_key": [
                "cracks_of_doom",
                "fangorn_forest",
                "hornburg",
                "isengard",
                "middle_earth",
                "mordor",
                "tierra_media"
            ],
            "time_facet": [
                "The end of the third age"
            ],
            "person_facet": [
                "Aragorn",
                "Arwen Und\u00f3miel",
                "Bilbo Baggins",
                "Boromir",
                "Celeborn",
                "Denethor",
                "Durin's Bane",
                "Elrond",
                "Elves of Eregion",
                "Faramir",
                "Frodo Baggins",
                "Galadriel",
                "Gandalf the Grey",
                "Gimli",
                "Gollum",
                "Gr\u00edma Wormtongue",
                "King Thranduil",
                "Legolas Greenleaf",
                "Meriadoc Brandybuck",
                "Mouth of Sauron",
                "Peregrin Took",
                "Samwise Gamgee",
                "Saruman the White",
                "Sauron",
                "Shelob",
                "Silvan Elves",
                "The Witch-king of Angmar",
                "Th\u00e9oden",
                "Tom Bombadil",
                "Treebeard",
                "the Nazg\u00fbl",
                "\u00c9omer",
                "\u00c9owyn"
            ],
            "subject_facet": [
                "Baggins, bilbo (fictitious character), fiction",
                "Baggins, frodo (fictitious character), fiction",
                "British and irish fiction (fictional works by one author)",
                "English Fantasy fiction",
                "English language",
                "English literature",
                "Fantasy fiction",
                "Ficci\u00f3n",
                "Ficci\u00f3n fant\u00e1stica inglesa",
                "Fiction",
                "Fiction in English",
                "Fiction, fantasy, epic",
                "Fiction, fantasy, general",
                "Fiction, media tie-in",
                "Frodo Baggins (Fictitious character)",
                "Gandalf (fictitious character), fiction",
                "Gift books",
                "Middle Earth (Imaginary place)",
                "Middle earth (imaginary place), fiction",
                "Open Library Staff Picks",
                "Quests (Expeditions)",
                "Qu\u00eate",
                "Romans, nouvelles",
                "Terre du Milieu (Lieu imaginaire)",
                "The Lord of the Rings",
                "Wizards"
            ],
            "_version_": 1762415140026712064,
            "place_facet": [
                "Cracks of Doom",
                "Fangorn Forest",
                "Hornburg",
                "Isengard",
                "Middle Earth",
                "Mordor",
                "Tierra Media"
            ],
            "lcc_sort": "PR-6039.00000000.O32 L617 1993",
            "author_facet": [
                "OL26320A J.R.R. Tolkien"
            ],
            "subject_key": [
                "baggins_bilbo_(fictitious_character)_fiction",
                "baggins_frodo_(fictitious_character)_fiction",
                "british_and_irish_fiction_(fictional_works_by_one_author)",
                "english_fantasy_fiction",
                "english_language",
                "english_literature",
                "fantasy_fiction",
                "ficci\u00f3n",
                "ficci\u00f3n_fant\u00e1stica_inglesa",
                "fiction",
                "fiction_fantasy_epic",
                "fiction_fantasy_general",
                "fiction_in_english",
                "fiction_media_tie-in",
                "frodo_baggins_(fictitious_character)",
                "gandalf_(fictitious_character)_fiction",
                "gift_books",
                "middle_earth_(imaginary_place)",
                "middle_earth_(imaginary_place)_fiction",
                "open_library_staff_picks",
                "quests_(expeditions)",
                "qu\u00eate",
                "romans_nouvelles",
                "terre_du_milieu_(lieu_imaginaire)",
                "the_lord_of_the_rings",
                "wizards"
            ],
            "ddc_sort": "823.914",
            "time_key": [
                "the_end_of_the_third_age"
            ]
        },
        {
            "key": "/works/OL14926019W",
            "type": "work",
            "seed": [
                "/books/OL9158229M",
                "/books/OL7465910M",
                "/books/OL7591516M",
                "/books/OL28164280M",
                "/books/OL10684465M",
                "/books/OL9619792M",
                "/books/OL7466533M",
                "/books/OL10236416M",
                "/books/OL7603172M",
                "/books/OL27038639M",
                "/books/OL8663980M",
                "/books/OL9216964M",
                "/books/OL23091869M",
                "/books/OL26768732M",
                "/books/OL26063706M",
                "/books/OL27037066M",
                "/books/OL27604960M",
                "/books/OL27037502M",
                "/books/OL27039284M",
                "/books/OL28327250M",
                "/books/OL27040878M",
                "/books/OL28551978M",
                "/books/OL29496576M",
                "/books/OL29486370M",
                "/works/OL14926019W",
                "/subjects/fiction_fantasy_epic",
                "/subjects/middle_earth_(imaginary_place)_fiction",
                "/subjects/baggins_frodo_(fictitious_character)_fiction",
                "/subjects/baggins_bilbo_(fictitious_character)_fiction",
                "/subjects/gandalf_(fictitious_character)_fiction",
                "/subjects/science_fiction_fantasy_horror",
                "/subjects/british_and_irish_fiction_(fictional_works_by_one_author)",
                "/subjects/fiction_fantasy_general",
                "/authors/OL26320A",
                "/authors/OL7983758A",
                "/authors/OL7958794A"
            ],
            "title": "Novels (Hobbit / Lord of the Rings)",
            "title_suggest": "Novels (Hobbit / Lord of the Rings)",
            "title_sort": "Novels (Hobbit / Lord of the Rings)",
            "edition_count": 24,
            "edition_key": [
                "OL9158229M",
                "OL7465910M",
                "OL7591516M",
                "OL28164280M",
                "OL10684465M",
                "OL9619792M",
                "OL7466533M",
                "OL10236416M",
                "OL7603172M",
                "OL27038639M",
                "OL8663980M",
                "OL9216964M",
                "OL23091869M",
                "OL26768732M",
                "OL26063706M",
                "OL27037066M",
                "OL27604960M",
                "OL27037502M",
                "OL27039284M",
                "OL28327250M",
                "OL27040878M",
                "OL28551978M",
                "OL29496576M",
                "OL29486370M"
            ],
            "publish_date": [
                "Sep 18, 2012",
                "Jun 30, 2013",
                "September 12, 1986",
                "Jul 14, 2014",
                "October 10, 2002",
                "May 31, 1983",
                "2006",
                "Nov 20, 2014",
                "2012",
                "2014",
                "2020",
                "Oct 31, 2000",
                "October 1984",
                "September 19, 1979",
                "Nov 07, 2013",
                "Nov 22, 2012",
                "October 2, 1988",
                "1997 November 3",
                "October 7, 2002",
                "Apr 01, 2010",
                "1982",
                "September 15, 1999"
            ],
            "publish_year": [
                2010,
                1997,
                2020,
                1986,
                2000,
                2006,
                2012,
                2002,
                2014,
                1979,
                1984,
                1983,
                1988,
                1999,
                1982,
                2013
            ],
            "first_publish_year": 1979,
            "number_of_pages_median": 1601,
            "publish_place": [
                "Sankt-Peterburg"
            ],
            "oclc": [
                "234219325",
                "77632007",
                "52751474"
            ],
            "lcc": [
                "PR-6039.00000000.O32"
            ],
            "isbn": [
                "9785352001844",
                "0345340426",
                "0544445783",
                "0345195299",
                "0007355149",
                "9780007522934",
                "853361568X",
                "9780261103566",
                "0007509847",
                "9780007105021",
                "9780007355143",
                "9780345195296",
                "0008376107",
                "9780345340429",
                "9780007144082",
                "0547928181",
                "9780007509843",
                "0007144083",
                "0345538374",
                "0007525516",
                "0007525524",
                "0008387753",
                "9780008376109",
                "9780345320568",
                "9788533615687",
                "9780395282632",
                "9780618002252",
                "9780007525515",
                "9780008112837",
                "5352001849",
                "0007105029",
                "0395282632",
                "1565117077",
                "9780345538376",
                "9780544445789",
                "9780007525522",
                "0261103563",
                "9780458923403",
                "9780008387754",
                "9780395489079",
                "0345320565",
                "0008112835",
                "0618002251",
                "9781565117075",
                "9780547928180",
                "0007522932",
                "0458923400",
                "0395489075"
            ],
            "last_modified_i": 1675384219,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "ratings_count_1": 1,
            "ratings_count_2": 0,
            "ratings_count_3": 0,
            "ratings_count_4": 2,
            "ratings_count_5": 13,
            "ratings_average": 4.625,
            "ratings_sortable": 3.7787256,
            "ratings_count": 16,
            "readinglog_count": 27,
            "want_to_read_count": 5,
            "currently_reading_count": 0,
            "already_read_count": 22,
            "cover_edition_key": "OL7466533M",
            "cover_i": 255844,
            "publisher": [
                "HarperCollins",
                "Harper Collins",
                "Highbridge Audio",
                "Del Rey Books",
                "Houghton Mifflin",
                "Del Rey",
                "HarperCollins Publishers Ltd",
                "Mariner Books",
                "Del Rey Fantasy",
                "HarperCollins Publishers",
                "Harpercollins",
                "HarperCollins Publishers Limited",
                "Harpercollins Pub Ltd",
                "Unwin Paperbacks",
                "Houghton Mifflin Harcourt",
                "Azbuka-klassika",
                "Collins",
                "Ballantine Books (Mm)"
            ],
            "language": [
                "eng",
                "rus"
            ],
            "author_key": [
                "OL26320A",
                "OL7983758A",
                "OL7958794A"
            ],
            "author_name": [
                "J.R.R. Tolkien",
                "Ensemble cast",
                "Alan Lee"
            ],
            "author_alternative_name": [
                "Dzhon R. R. Tolkin",
                "Yue Han Luo Na De Rui Er Tuo Er Jin",
                "J.R.R. Tolkein",
                "J. R. R. Tolkien",
                "John Ronald Reuel Tolkien",
                "J. R. R. Tolkein"
            ],
            "subject": [
                "Fiction, fantasy, epic",
                "Middle earth (imaginary place), fiction",
                "Baggins, frodo (fictitious character), fiction",
                "Baggins, bilbo (fictitious character), fiction",
                "Gandalf (fictitious character), fiction",
                "Science fiction, fantasy, horror",
                "British and irish fiction (fictional works by one author)",
                "Fiction, fantasy, general"
            ],
            "id_amazon": [
                "0547928181"
            ],
            "id_goodreads": [
                "15382",
                "7349201",
                "15752022",
                "899771",
                "1358025",
                "18509",
                "837613",
                "598925",
                "837612",
                "15336"
            ],
            "id_librarything": [
                "1386651",
                "2954673",
                "4881",
                "3206242"
            ],
            "publisher_facet": [
                "Azbuka-klassika",
                "Ballantine Books (Mm)",
                "Collins",
                "Del Rey",
                "Del Rey Books",
                "Del Rey Fantasy",
                "Harper Collins",
                "HarperCollins",
                "HarperCollins Publishers",
                "HarperCollins Publishers Limited",
                "HarperCollins Publishers Ltd",
                "Harpercollins",
                "Harpercollins Pub Ltd",
                "Highbridge Audio",
                "Houghton Mifflin",
                "Houghton Mifflin Harcourt",
                "Mariner Books",
                "Unwin Paperbacks"
            ],
            "subject_facet": [
                "Baggins, bilbo (fictitious character), fiction",
                "Baggins, frodo (fictitious character), fiction",
                "British and irish fiction (fictional works by one author)",
                "Fiction, fantasy, epic",
                "Fiction, fantasy, general",
                "Gandalf (fictitious character), fiction",
                "Middle earth (imaginary place), fiction",
                "Science fiction, fantasy, horror"
            ],
            "_version_": 1759749866296180737,
            "lcc_sort": "PR-6039.00000000.O32",
            "author_facet": [
                "OL26320A J.R.R. Tolkien",
                "OL7958794A Alan Lee",
                "OL7983758A Ensemble cast"
            ],
            "subject_key": [
                "baggins_bilbo_(fictitious_character)_fiction",
                "baggins_frodo_(fictitious_character)_fiction",
                "british_and_irish_fiction_(fictional_works_by_one_author)",
                "fiction_fantasy_epic",
                "fiction_fantasy_general",
                "gandalf_(fictitious_character)_fiction",
                "middle_earth_(imaginary_place)_fiction",
                "science_fiction_fantasy_horror"
            ]
        },
        {
            "key": "/works/OL27416187W",
            "type": "work",
            "seed": [
                "/books/OL37348044M",
                "/books/OL37349289M",
                "/books/OL37347552M",
                "/books/OL37353387M",
                "/books/OL37359690M",
                "/books/OL37367325M",
                "/books/OL37371066M",
                "/books/OL37363400M",
                "/books/OL37341949M",
                "/works/OL27416187W",
                "/authors/OL26320A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 9,
            "edition_key": [
                "OL37348044M",
                "OL37349289M",
                "OL37347552M",
                "OL37353387M",
                "OL37359690M",
                "OL37367325M",
                "OL37371066M",
                "OL37363400M",
                "OL37341949M"
            ],
            "publish_date": [
                "1976",
                "2009",
                "2022",
                "1991",
                "2003"
            ],
            "publish_year": [
                1976,
                2009,
                2022,
                1991,
                2003
            ],
            "first_publish_year": 1976,
            "isbn": [
                "9780061917851",
                "0008537763",
                "9780061917844",
                "9780618433223",
                "0061917834",
                "0061917826",
                "0618433228",
                "9780061917837",
                "0395604230",
                "9780395082577",
                "0061917842",
                "9780061917820",
                "9780395604236",
                "9780008537760",
                "0618345841",
                "9780618345847",
                "0061917850",
                "0395082579"
            ],
            "last_modified_i": 1661341253,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "ratings_count_1": 0,
            "ratings_count_2": 0,
            "ratings_count_3": 1,
            "ratings_count_4": 0,
            "ratings_count_5": 0,
            "ratings_average": 3.0,
            "ratings_sortable": 2.1948824,
            "ratings_count": 1,
            "readinglog_count": 2,
            "want_to_read_count": 1,
            "currently_reading_count": 0,
            "already_read_count": 1,
            "publisher": [
                "HarperCollins Publishers",
                "HarperCollins Publishers Limited",
                "Houghton Mifflin Harcourt Publishing Company"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL26320A"
            ],
            "author_name": [
                "J.R.R. Tolkien"
            ],
            "author_alternative_name": [
                "J.R.R. Tolkein",
                "Dzhon R. R. Tolkin",
                "J. R. R. Tolkein",
                "J. R. R. Tolkien",
                "Yue Han Luo Na De Rui Er Tuo Er Jin",
                "John Ronald Reuel Tolkien"
            ],
            "publisher_facet": [
                "HarperCollins Publishers",
                "HarperCollins Publishers Limited",
                "Houghton Mifflin Harcourt Publishing Company"
            ],
            "_version_": 1759776010702684162,
            "author_facet": [
                "OL26320A J.R.R. Tolkien"
            ]
        },
        {
            "key": "/works/OL646331W",
            "type": "work",
            "seed": [
                "/books/OL8478607M",
                "/books/OL12268327M",
                "/books/OL23015935M",
                "/books/OL8803174M",
                "/books/OL9216924M",
                "/books/OL8803116M",
                "/books/OL7262209M",
                "/works/OL646331W",
                "/subjects/biblical_teaching",
                "/subjects/folklore",
                "/subjects/grail",
                "/subjects/leadership",
                "/subjects/management",
                "/subjects/promotions",
                "/subjects/rings",
                "/subjects/work",
                "/subjects/sources",
                "/subjects/knowledge",
                "/subjects/mythology",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/mythology_in_literature",
                "/subjects/folklore_in_literature",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/subjects/kings_and_rulers_mythology",
                "/subjects/place:europe",
                "/authors/OL50039A"
            ],
            "title": "Realm of the Ring Lords",
            "title_suggest": "Realm of the Ring Lords",
            "title_sort": "Realm of the Ring Lords",
            "edition_count": 7,
            "edition_key": [
                "OL8478607M",
                "OL12268327M",
                "OL23015935M",
                "OL8803174M",
                "OL9216924M",
                "OL8803116M",
                "OL7262209M"
            ],
            "publish_date": [
                "2002",
                "October 2001",
                "May 6, 2003",
                "January 2003",
                "November 2000",
                "January 2002"
            ],
            "publish_year": [
                2002,
                2003,
                2000,
                2001
            ],
            "first_publish_year": 2000,
            "number_of_pages_median": 436,
            "lccn": [
                "2005415317"
            ],
            "publish_place": [
                "Gloucester, MA"
            ],
            "oclc": [
                "53808868",
                "50232910"
            ],
            "lcc": [
                "GR-0048.00000000",
                "PR-6039.00000000.O32 L63369 2004",
                "GR-0135.00000000.G37 2002"
            ],
            "ddc": [
                "398.2094"
            ],
            "isbn": [
                "0007142935",
                "1931412944",
                "0953768678",
                "9780953768677",
                "9781931412940",
                "1903773172",
                "9781931412148",
                "9781903773178",
                "1931412146",
                "9780007142934"
            ],
            "last_modified_i": 1671246262,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "unset0000unse_n1d6"
            ],
            "ia_collection": [
                "china",
                "inlibrary",
                "internetarchivebooks",
                "printdisabled",
                "universityofarizona-ol"
            ],
            "ia_collection_s": "china;inlibrary;internetarchivebooks;printdisabled;universityofarizona-ol",
            "lending_edition_s": "OL23015935M",
            "lending_identifier_s": "unset0000unse_n1d6",
            "printdisabled_s": "OL23015935M",
            "readinglog_count": 3,
            "want_to_read_count": 3,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL8803116M",
            "cover_i": 956526,
            "first_sentence": [
                "J. R. R. Tolkien's The Lord of The Rings is one of the most enchanting and successful tales of all time."
            ],
            "publisher": [
                "Fair Winds Press",
                "MediaQuest",
                "Fair Winds Press (MA)",
                "HarperCollins Publishers Ltd"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL50039A"
            ],
            "author_name": [
                "Laurence Gardner"
            ],
            "place": [
                "Europe"
            ],
            "subject": [
                "Biblical teaching",
                "Folklore",
                "Grail",
                "Leadership",
                "Management",
                "Promotions",
                "Rings",
                "Work",
                "Sources",
                "Knowledge",
                "Mythology",
                "Middle Earth (Imaginary place)",
                "Mythology in literature",
                "Folklore in literature",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Kings and rulers, mythology"
            ],
            "id_goodreads": [
                "1090324",
                "15328",
                "883935",
                "2039687",
                "883934"
            ],
            "id_librarything": [
                "153562"
            ],
            "ia_box_id": [
                "IA1296709"
            ],
            "publisher_facet": [
                "Fair Winds Press",
                "Fair Winds Press (MA)",
                "HarperCollins Publishers Ltd",
                "MediaQuest"
            ],
            "place_key": [
                "europe"
            ],
            "subject_facet": [
                "Biblical teaching",
                "Folklore",
                "Folklore in literature",
                "Grail",
                "Kings and rulers, mythology",
                "Knowledge",
                "Leadership",
                "Management",
                "Middle Earth (Imaginary place)",
                "Mythology",
                "Mythology in literature",
                "Promotions",
                "Rings",
                "Sources",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Work"
            ],
            "_version_": 1759797297747591172,
            "place_facet": [
                "Europe"
            ],
            "lcc_sort": "PR-6039.00000000.O32 L63369 2004",
            "author_facet": [
                "OL50039A Laurence Gardner"
            ],
            "subject_key": [
                "biblical_teaching",
                "folklore",
                "folklore_in_literature",
                "grail",
                "kings_and_rulers_mythology",
                "knowledge",
                "leadership",
                "management",
                "middle_earth_(imaginary_place)",
                "mythology",
                "mythology_in_literature",
                "promotions",
                "rings",
                "sources",
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "work"
            ],
            "ddc_sort": "398.2094"
        },
        {
            "key": "/works/OL8527426W",
            "type": "work",
            "seed": [
                "/books/OL10957365M",
                "/books/OL10957364M",
                "/books/OL9409698M",
                "/books/OL9314653M",
                "/books/OL9701406M",
                "/works/OL8527426W",
                "/authors/OL2853379A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 5,
            "edition_key": [
                "OL10957365M",
                "OL10957364M",
                "OL9409698M",
                "OL9314653M",
                "OL9701406M"
            ],
            "publish_date": [
                "September 2002",
                "August 30, 2005",
                "October 2001"
            ],
            "publish_year": [
                2002,
                2001,
                2005
            ],
            "first_publish_year": 2001,
            "number_of_pages_median": 128,
            "isbn": [
                "9780768325294",
                "0768325781",
                "9780768374698",
                "9780768325782",
                "0768325293",
                "9780768325249",
                "0768374693",
                "0768325242",
                "9780768325232",
                "0768325234"
            ],
            "last_modified_i": 1282021198,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "ratings_count_1": 0,
            "ratings_count_2": 0,
            "ratings_count_3": 0,
            "ratings_count_4": 0,
            "ratings_count_5": 1,
            "ratings_average": 5.0,
            "ratings_sortable": 2.4036636,
            "ratings_count": 1,
            "readinglog_count": 8,
            "want_to_read_count": 7,
            "currently_reading_count": 0,
            "already_read_count": 1,
            "cover_edition_key": "OL9701406M",
            "cover_i": 1454705,
            "publisher": [
                "Cedco Publishing Company"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL2853379A"
            ],
            "author_name": [
                "Cedco Publishing"
            ],
            "id_goodreads": [
                "5984308",
                "59318",
                "130022"
            ],
            "id_librarything": [
                "4607237"
            ],
            "publisher_facet": [
                "Cedco Publishing Company"
            ],
            "_version_": 1759801498894598144,
            "author_facet": [
                "OL2853379A Cedco Publishing"
            ]
        },
        {
            "key": "/works/OL3469307W",
            "type": "work",
            "seed": [
                "/books/OL1700996M",
                "/books/OL22149857M",
                "/books/OL3938088M",
                "/books/OL29652315M",
                "/books/OL29649905M",
                "/works/OL3469307W",
                "/subjects/english_fantasy_fiction",
                "/subjects/english_political_fiction",
                "/subjects/fantasy_fiction_english",
                "/subjects/history",
                "/subjects/history_and_criticism",
                "/subjects/literature_and_society",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/myth_in_literature",
                "/subjects/political_and_social_views",
                "/subjects/political_fiction_english",
                "/subjects/politics_and_literature",
                "/subjects/power_(social_sciences)_in_literature",
                "/subjects/political_fiction_history_and_criticism",
                "/subjects/fantasy_fiction_history_and_criticism",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/subjects/mythology_in_literature",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/subjects/place:great_britain",
                "/subjects/time:20th_century",
                "/authors/OL578238A",
                "/authors/OL7798802A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 5,
            "edition_key": [
                "OL1700996M",
                "OL22149857M",
                "OL3938088M",
                "OL29652315M",
                "OL29649905M"
            ],
            "publish_date": [
                "1992",
                "2001",
                "2010"
            ],
            "publish_year": [
                1992,
                2001,
                2010
            ],
            "first_publish_year": 1992,
            "number_of_pages_median": 162,
            "lccn": [
                "92001402",
                "2001002583",
                "20012583"
            ],
            "publish_place": [
                "New York",
                "Toronto",
                "Lexington"
            ],
            "lcc": [
                "PR-6039.00000000.O32L6332 2001",
                "PR-6039.00000000.O32 L6332 2001",
                "PR-6039.00000000.O32 L6332 1992"
            ],
            "ddc": [
                "823.912"
            ],
            "isbn": [
                "0813190177",
                "0805794417",
                "9780813128054",
                "9780813138015",
                "9780805785715",
                "9780813190174",
                "0813138019",
                "0813128056",
                "9780805794410",
                "080578571X"
            ],
            "last_modified_i": 1676207712,
            "ebook_count_i": 2,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringst00chan",
                "isbn_9780813190174"
            ],
            "ia_collection": [
                "binghamton-ol",
                "china",
                "dartmouthlibrary-ol",
                "gwulibraries-ol",
                "inlibrary",
                "internetarchivebooks",
                "printdisabled",
                "randolph-macon-college-ol",
                "riceuniversity-ol",
                "rochester-ol",
                "the-claremont-colleges-ol",
                "uni-ol",
                "universityofarizona-ol",
                "universityofcoloradoboulder-ol",
                "universityofoklahoma-ol"
            ],
            "ia_collection_s": "binghamton-ol;china;dartmouthlibrary-ol;gwulibraries-ol;inlibrary;internetarchivebooks;printdisabled;randolph-macon-college-ol;riceuniversity-ol;rochester-ol;the-claremont-colleges-ol;uni-ol;universityofarizona-ol;universityofcoloradoboulder-ol;universityofoklahoma-ol",
            "lending_edition_s": "OL1700996M",
            "lending_identifier_s": "lordofringst00chan",
            "printdisabled_s": "OL1700996M;OL22149857M",
            "readinglog_count": 4,
            "want_to_read_count": 4,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL1700996M",
            "cover_i": 583487,
            "publisher": [
                "Twayne Publishers",
                "Maxwell Macmillan Canada",
                "University Press of Kentucky",
                "Maxwell Macmillan International",
                "The University Press of Kentucky"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL578238A",
                "OL7798802A"
            ],
            "author_name": [
                "Jane Chance",
                "Jane Chance"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "place": [
                "Great Britain"
            ],
            "subject": [
                "English Fantasy fiction",
                "English Political fiction",
                "Fantasy fiction, English",
                "History",
                "History and criticism",
                "Literature and society",
                "Middle Earth (Imaginary place)",
                "Myth in literature",
                "Political and social views",
                "Political fiction, English",
                "Politics and literature",
                "Power (Social sciences) in literature",
                "Political fiction, history and criticism",
                "Fantasy fiction, history and criticism",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Mythology in literature"
            ],
            "time": [
                "20th century"
            ],
            "id_goodreads": [
                "1280690",
                "998764",
                "54700"
            ],
            "id_librarything": [
                "837759"
            ],
            "ia_loaded_id": [
                "lordofringst00chan"
            ],
            "ia_box_id": [
                "IA1157316",
                "IA145116",
                "IA158801"
            ],
            "publisher_facet": [
                "Maxwell Macmillan Canada",
                "Maxwell Macmillan International",
                "The University Press of Kentucky",
                "Twayne Publishers",
                "University Press of Kentucky"
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "place_key": [
                "great_britain"
            ],
            "time_facet": [
                "20th century"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "English Fantasy fiction",
                "English Political fiction",
                "Fantasy fiction, English",
                "Fantasy fiction, history and criticism",
                "History",
                "History and criticism",
                "Literature and society",
                "Middle Earth (Imaginary place)",
                "Myth in literature",
                "Mythology in literature",
                "Political and social views",
                "Political fiction, English",
                "Political fiction, history and criticism",
                "Politics and literature",
                "Power (Social sciences) in literature",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "_version_": 1759790480315383813,
            "place_facet": [
                "Great Britain"
            ],
            "lcc_sort": "PR-6039.00000000.O32 L6332 2001",
            "author_facet": [
                "OL578238A Jane Chance",
                "OL7798802A Jane Chance"
            ],
            "subject_key": [
                "english_fantasy_fiction",
                "english_political_fiction",
                "fantasy_fiction_english",
                "fantasy_fiction_history_and_criticism",
                "history",
                "history_and_criticism",
                "literature_and_society",
                "middle_earth_(imaginary_place)",
                "myth_in_literature",
                "mythology_in_literature",
                "political_and_social_views",
                "political_fiction_english",
                "political_fiction_history_and_criticism",
                "politics_and_literature",
                "power_(social_sciences)_in_literature",
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973"
            ],
            "ddc_sort": "823.912",
            "time_key": [
                "20th_century"
            ]
        },
        {
            "key": "/works/OL32343911W",
            "type": "work",
            "seed": [
                "/books/OL44104468M",
                "/books/OL44098068M",
                "/books/OL7273574M",
                "/books/OL44099744M",
                "/works/OL32343911W",
                "/subjects/fiction_fantasy_epic",
                "/subjects/middle_earth_(imaginary_place)_fiction",
                "/subjects/baggins_frodo_(fictitious_character)_fiction",
                "/subjects/gandalf_(fictitious_character)_fiction",
                "/subjects/british_and_irish_fiction_(fictional_works_by_one_author)",
                "/authors/OL10659931A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 4,
            "edition_key": [
                "OL44104468M",
                "OL44098068M",
                "OL7273574M",
                "OL44099744M"
            ],
            "publish_date": [
                "September 5, 1991",
                "1980",
                "1988",
                "2000"
            ],
            "publish_year": [
                2000,
                1980,
                1988,
                1991
            ],
            "first_publish_year": 1980,
            "number_of_pages_median": 1200,
            "isbn": [
                "0044406797",
                "0048231835",
                "9780007105007",
                "0044403054",
                "9780044406792",
                "9780048231833",
                "9780044403050",
                "0007105002"
            ],
            "last_modified_i": 1679121830,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 0,
            "want_to_read_count": 0,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL44098068M",
            "cover_i": 13599163,
            "publisher": [
                "HarperCollins Publishers Limited",
                "HarperCollins"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL10659931A"
            ],
            "author_name": [
                "J. R. R. Tolkien"
            ],
            "subject": [
                "Fiction, fantasy, epic",
                "Middle earth (imaginary place), fiction",
                "Baggins, frodo (fictitious character), fiction",
                "Gandalf (fictitious character), fiction",
                "British and irish fiction (fictional works by one author)"
            ],
            "id_goodreads": [
                "2293575"
            ],
            "id_librarything": [
                "1386651"
            ],
            "publisher_facet": [
                "HarperCollins",
                "HarperCollins Publishers Limited"
            ],
            "subject_facet": [
                "Baggins, frodo (fictitious character), fiction",
                "British and irish fiction (fictional works by one author)",
                "Fiction, fantasy, epic",
                "Gandalf (fictitious character), fiction",
                "Middle earth (imaginary place), fiction"
            ],
            "_version_": 1760686855188119552,
            "author_facet": [
                "OL10659931A J. R. R. Tolkien"
            ],
            "subject_key": [
                "baggins_frodo_(fictitious_character)_fiction",
                "british_and_irish_fiction_(fictional_works_by_one_author)",
                "fiction_fantasy_epic",
                "gandalf_(fictitious_character)_fiction",
                "middle_earth_(imaginary_place)_fiction"
            ]
        },
        {
            "key": "/works/OL548432W",
            "type": "work",
            "seed": [
                "/books/OL3410671M",
                "/books/OL21363237M",
                "/books/OL26236285M",
                "/books/OL26236284M",
                "/works/OL548432W",
                "/subjects/english_fantasy_fiction",
                "/subjects/history_and_criticism",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/handbooks_manuals",
                "/subjects/fiction_fantasy_epic",
                "/subjects/lord_of_the_rings_(tolkien_j.r.r.)",
                "/subjects/terre_du_milieu_(lieu_imaginaire)",
                "/subjects/fiction",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/subjects/fiction_fantasy_general",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL39015A",
                "/authors/OL2623691A"
            ],
            "title": "The lord of the rings",
            "title_suggest": "The lord of the rings",
            "title_sort": "The lord of the rings",
            "subtitle": "A Reader's Companion",
            "edition_count": 4,
            "edition_key": [
                "OL3410671M",
                "OL21363237M",
                "OL26236285M",
                "OL26236284M"
            ],
            "publish_date": [
                "2014 (60th Anniversary edition)",
                "2005",
                "2008"
            ],
            "publish_year": [
                2005,
                2014,
                2008
            ],
            "first_publish_year": 2005,
            "number_of_pages_median": 935,
            "lccn": [
                "2007279748",
                "2005026697"
            ],
            "publish_place": [
                "Boston",
                "United Kingdom",
                "London"
            ],
            "oclc": [
                "61687696",
                "182663111"
            ],
            "contributor": [
                "Scull, Christina."
            ],
            "lcc": [
                "PR-6039.00000000.O32L6338 2005",
                "PR-6039.00000000.O32 L6338 2005b",
                "PR-6039.00000000.O32 .L6 2005",
                "PR-6039.00000000.O32",
                "PR-6039.00000000.O32 L6338 2005",
                "PR-6039.00000000.O32 L6338 2008"
            ],
            "ddc": [
                "823.912"
            ],
            "isbn": [
                "000720308X",
                "9780007203086",
                "000755690X",
                "9780007270606",
                "000720907X",
                "9780007556908",
                "9780618642670",
                "0618642676",
                "9780007209071",
                "0007270607"
            ],
            "last_modified_i": 1678256470,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 1,
            "want_to_read_count": 1,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL3410671M",
            "cover_i": 395072,
            "publisher": [
                "Houghton Mifflin Co.",
                "HarperCollins",
                "HarperCollins Publishers Ltd."
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL39015A",
                "OL2623691A"
            ],
            "author_name": [
                "Wayne G. Hammond",
                "Christina Scull"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "English Fantasy fiction",
                "History and criticism",
                "Middle Earth (Imaginary place)",
                "Handbooks, manuals",
                "Fiction, fantasy, epic",
                "Lord of the rings (Tolkien, J.R.R.)",
                "Terre du Milieu (lieu imaginaire)",
                "Fiction",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Fiction, fantasy, general"
            ],
            "id_goodreads": [
                "15232",
                "892556",
                "877738"
            ],
            "id_librarything": [
                "195642"
            ],
            "publisher_facet": [
                "HarperCollins",
                "HarperCollins Publishers Ltd.",
                "Houghton Mifflin Co."
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "English Fantasy fiction",
                "Fiction",
                "Fiction, fantasy, epic",
                "Fiction, fantasy, general",
                "Handbooks, manuals",
                "History and criticism",
                "Lord of the rings (Tolkien, J.R.R.)",
                "Middle Earth (Imaginary place)",
                "Terre du Milieu (lieu imaginaire)",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "_version_": 1759911412295008256,
            "lcc_sort": "PR-6039.00000000.O32 L6338 2005b",
            "author_facet": [
                "OL2623691A Christina Scull",
                "OL39015A Wayne G. Hammond"
            ],
            "subject_key": [
                "english_fantasy_fiction",
                "fiction",
                "fiction_fantasy_epic",
                "fiction_fantasy_general",
                "handbooks_manuals",
                "history_and_criticism",
                "lord_of_the_rings_(tolkien_j.r.r.)",
                "middle_earth_(imaginary_place)",
                "terre_du_milieu_(lieu_imaginaire)",
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973"
            ],
            "ddc_sort": "823.912"
        },
        {
            "key": "/works/OL8488048W",
            "type": "work",
            "seed": [
                "/books/OL10872493M",
                "/books/OL8005591M",
                "/books/OL10872192M",
                "/books/OL8005590M",
                "/books/OL8005696M",
                "/works/OL8488048W",
                "/subjects/saxophone",
                "/subjects/motion_picture_music",
                "/subjects/clarinet_music",
                "/subjects/flute_music",
                "/authors/OL2834626A"
            ],
            "title": "Lord of the Rings Instrumental Solos",
            "title_suggest": "Lord of the Rings Instrumental Solos",
            "title_sort": "Lord of the Rings Instrumental Solos",
            "edition_count": 5,
            "edition_key": [
                "OL10872493M",
                "OL8005591M",
                "OL10872192M",
                "OL8005590M",
                "OL8005696M"
            ],
            "publish_date": [
                "August 2004"
            ],
            "publish_year": [
                2004
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 28,
            "oclc": [
                "58959932",
                "58961329"
            ],
            "isbn": [
                "0757916570",
                "0757916597",
                "9780757916595",
                "9780757916571",
                "0757916589",
                "9780757923258",
                "0757923240",
                "9780757916588",
                "9780757923241",
                "0757923259"
            ],
            "last_modified_i": 1670637051,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL8005590M",
            "cover_i": 1416148,
            "first_sentence": [
                "THE LORD OF THE RINGS"
            ],
            "publisher": [
                "Warner Bros. Publications"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL2834626A"
            ],
            "author_name": [
                "Howard Shore"
            ],
            "subject": [
                "Saxophone",
                "Motion picture music",
                "Clarinet music",
                "Flute music"
            ],
            "id_goodreads": [
                "7026123",
                "15234",
                "580011",
                "1133774",
                "15334"
            ],
            "id_librarything": [
                "534128"
            ],
            "publisher_facet": [
                "Warner Bros. Publications"
            ],
            "subject_facet": [
                "Clarinet music",
                "Flute music",
                "Motion picture music",
                "Saxophone"
            ],
            "_version_": 1759801578490953729,
            "author_facet": [
                "OL2834626A Howard Shore"
            ],
            "subject_key": [
                "clarinet_music",
                "flute_music",
                "motion_picture_music",
                "saxophone"
            ]
        },
        {
            "key": "/works/OL456337W",
            "type": "work",
            "seed": [
                "/books/OL22717303M",
                "/books/OL22718045M",
                "/books/OL8169231M",
                "/books/OL8169232M",
                "/works/OL456337W",
                "/authors/OL26751A"
            ],
            "title": "Reading the Lord of the Rings",
            "title_suggest": "Reading the Lord of the Rings",
            "title_sort": "Reading the Lord of the Rings",
            "subtitle": "New Writings on Tolkien's Trilogy",
            "edition_count": 4,
            "edition_key": [
                "OL22717303M",
                "OL22718045M",
                "OL8169231M",
                "OL8169232M"
            ],
            "publish_date": [
                "February 28, 2006",
                "2005"
            ],
            "publish_year": [
                2005,
                2006
            ],
            "first_publish_year": 2005,
            "number_of_pages_median": 214,
            "publish_place": [
                "London",
                "New York",
                "LONDON"
            ],
            "contributor": [
                "Eaglestone, Robert, 1968-"
            ],
            "lcc": [
                "PR-6039.00000000.O32 L63713 2006"
            ],
            "ddc": [
                "823.912"
            ],
            "isbn": [
                "9780826484604",
                "9780826484598",
                "082648459X",
                "0826484603"
            ],
            "last_modified_i": 1564590677,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL8169231M",
            "cover_i": 1573221,
            "publisher": [
                "CONTINUUM",
                "Continuum",
                "Continuum International Publishing Group"
            ],
            "language": [
                "und",
                "eng"
            ],
            "author_key": [
                "OL26751A"
            ],
            "author_name": [
                "Robert Eaglestone"
            ],
            "id_goodreads": [
                "214164",
                "1280719"
            ],
            "id_librarything": [
                "1187524",
                "9447545"
            ],
            "publisher_facet": [
                "CONTINUUM",
                "Continuum",
                "Continuum International Publishing Group"
            ],
            "_version_": 1759792915466420226,
            "lcc_sort": "PR-6039.00000000.O32 L63713 2006",
            "author_facet": [
                "OL26751A Robert Eaglestone"
            ],
            "ddc_sort": "823.912"
        },
        {
            "key": "/works/OL17810871W",
            "type": "work",
            "seed": [
                "/books/OL7605192M",
                "/books/OL23273046M",
                "/books/OL3304645M",
                "/books/OL7605193M",
                "/works/OL17810871W",
                "/subjects/english_fantasy_fiction",
                "/subjects/history_and_criticism",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/subjects/fantasy_fiction_history_and_criticism",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/lord_of_the_rings_(tolkien_j.r.r.)",
                "/authors/OL399786A",
                "/authors/OL19674A",
                "/authors/OL2755008A"
            ],
            "title": "Understanding The lord of the rings",
            "title_suggest": "Understanding The lord of the rings",
            "title_sort": "Understanding The lord of the rings",
            "edition_count": 4,
            "edition_key": [
                "OL7605192M",
                "OL23273046M",
                "OL3304645M",
                "OL7605193M"
            ],
            "publish_date": [
                "May 24, 2004",
                "May 12, 2005",
                "2004"
            ],
            "publish_year": [
                2005,
                2004
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 299,
            "lccn": [
                "2004047274"
            ],
            "publish_place": [
                "Boston"
            ],
            "oclc": [
                "144556898",
                "54767571"
            ],
            "contributor": [
                "Zimbardo, Rose A.",
                "Isaacs, Neil David, 1931-",
                "Rose A Zimbardo (Editor)",
                "Neil D Isaacs (Editor)"
            ],
            "lcc": [
                "PR-6039.00000000.O32L63775",
                "PR-6039.00000000.O32 L63775 2004"
            ],
            "ddc": [
                "823.912"
            ],
            "isbn": [
                "061842251X",
                "0618422536",
                "9780618422517",
                "9780618422531"
            ],
            "last_modified_i": 1678237238,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "isbn_9780618422517"
            ],
            "ia_collection": [
                "americanuniversity-ol",
                "binghamton-ol",
                "china",
                "delawarecountydistrictlibrary-ol",
                "gwulibraries-ol",
                "inlibrary",
                "internetarchivebooks",
                "kalamazoocollege-ol",
                "printdisabled",
                "rochester-ol",
                "universityofarizona-ol",
                "universityofcoloradoboulder-ol",
                "universityofoklahoma-ol",
                "wilsoncollege-ol"
            ],
            "ia_collection_s": "americanuniversity-ol;binghamton-ol;china;delawarecountydistrictlibrary-ol;gwulibraries-ol;inlibrary;internetarchivebooks;kalamazoocollege-ol;printdisabled;rochester-ol;universityofarizona-ol;universityofcoloradoboulder-ol;universityofoklahoma-ol;wilsoncollege-ol",
            "lending_edition_s": "OL3304645M",
            "lending_identifier_s": "isbn_9780618422517",
            "printdisabled_s": "OL3304645M",
            "readinglog_count": 3,
            "want_to_read_count": 3,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL7605192M",
            "cover_i": 394453,
            "first_sentence": [
                "IT IS ALMOST forty-three years since Rose Zimbardo pointed me toward Middle-earth."
            ],
            "publisher": [
                "Houghton Mifflin"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL399786A",
                "OL19674A",
                "OL2755008A"
            ],
            "author_name": [
                "Zimbardo, Rose A.",
                "Neil David Isaacs",
                "Neil D. Isaacs"
            ],
            "subject": [
                "English Fantasy fiction",
                "History and criticism",
                "Middle Earth (Imaginary place)",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Fantasy fiction, history and criticism",
                "Middle earth (imaginary place)",
                "Lord of the rings (Tolkien, J.R.R.)"
            ],
            "id_goodreads": [
                "23640",
                "899751"
            ],
            "id_librarything": [
                "44333"
            ],
            "ia_box_id": [
                "IA1159913"
            ],
            "publisher_facet": [
                "Houghton Mifflin"
            ],
            "subject_facet": [
                "English Fantasy fiction",
                "Fantasy fiction, history and criticism",
                "History and criticism",
                "Lord of the rings (Tolkien, J.R.R.)",
                "Middle Earth (Imaginary place)",
                "Middle earth (imaginary place)",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "_version_": 1759909440665944065,
            "lcc_sort": "PR-6039.00000000.O32 L63775 2004",
            "author_facet": [
                "OL19674A Neil David Isaacs",
                "OL2755008A Neil D. Isaacs",
                "OL399786A Zimbardo, Rose A."
            ],
            "subject_key": [
                "english_fantasy_fiction",
                "fantasy_fiction_history_and_criticism",
                "history_and_criticism",
                "lord_of_the_rings_(tolkien_j.r.r.)",
                "middle_earth_(imaginary_place)",
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973"
            ],
            "ddc_sort": "823.912"
        },
        {
            "key": "/works/OL3062802W",
            "type": "work",
            "seed": [
                "/books/OL7261537M",
                "/books/OL9216252M",
                "/books/OL9216253M",
                "/books/OL23060707M",
                "/books/OL7261538M",
                "/works/OL3062802W",
                "/subjects/fantasy_films",
                "/subjects/libros_de_l\u00e1minas",
                "/subjects/lord_of_the_rings",
                "/subjects/pel\u00edculas_fant\u00e1sticas",
                "/subjects/pictorial_works",
                "/subjects/se\u00f1or_del_anillos_la_comunidad_del_anillo_(pel\u00edcula)",
                "/subjects/lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "/subjects/fantasy_films_history_and_criticism",
                "/subjects/motion_pictures_setting_and_scenery",
                "/subjects/middle_earth_(imaginary_place)",
                "/authors/OL475982A"
            ],
            "title": "The \"Lord of the Rings\" Official Movie Guide",
            "title_suggest": "The \"Lord of the Rings\" Official Movie Guide",
            "title_sort": "The \"Lord of the Rings\" Official Movie Guide",
            "edition_count": 5,
            "edition_key": [
                "OL7261537M",
                "OL9216252M",
                "OL9216253M",
                "OL23060707M",
                "OL7261538M"
            ],
            "publish_date": [
                "November 6, 2001",
                "2001"
            ],
            "publish_year": [
                2001
            ],
            "first_publish_year": 2001,
            "number_of_pages_median": 120,
            "publish_place": [
                "Barcelona"
            ],
            "oclc": [
                "49235298"
            ],
            "isbn": [
                "0007119089",
                "9788445073605",
                "0007119097",
                "8445073605",
                "9780007119097",
                "9780007119080"
            ],
            "last_modified_i": 1671246115,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringsoffic0000sibl"
            ],
            "ia_collection": [
                "inlibrary",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "inlibrary;internetarchivebooks;printdisabled",
            "lending_edition_s": "OL7261538M",
            "lending_identifier_s": "lordofringsoffic0000sibl",
            "printdisabled_s": "OL7261538M",
            "cover_edition_key": "OL9216252M",
            "cover_i": 8997,
            "first_sentence": [
                "It would be tempting to liken Peter Jackson to a powerful wizard, conjuring up movie magic, if his build was not more suggestive of a hobbit."
            ],
            "publisher": [
                "Ediciones Minotauro",
                "HarperCollins Entertainment"
            ],
            "language": [
                "spa"
            ],
            "author_key": [
                "OL475982A"
            ],
            "author_name": [
                "Brian Sibley"
            ],
            "author_alternative_name": [
                "Brian David Sibley"
            ],
            "subject": [
                "Fantasy films",
                "Libros de l\u00e1minas",
                "Lord of the rings",
                "Pel\u00edculas fant\u00e1sticas",
                "Pictorial works",
                "Se\u00f1or del anillos, la comunidad del anillo (Pel\u00edcula)",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Fantasy films, history and criticism",
                "Motion pictures, setting and scenery",
                "Middle earth (imaginary place)"
            ],
            "id_goodreads": [
                "830053",
                "830054",
                "984758"
            ],
            "id_librarything": [
                "2489144",
                "9227805"
            ],
            "ia_box_id": [
                "IA1916512"
            ],
            "publisher_facet": [
                "Ediciones Minotauro",
                "HarperCollins Entertainment"
            ],
            "subject_facet": [
                "Fantasy films",
                "Fantasy films, history and criticism",
                "Libros de l\u00e1minas",
                "Lord of the rings",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Middle earth (imaginary place)",
                "Motion pictures, setting and scenery",
                "Pel\u00edculas fant\u00e1sticas",
                "Pictorial works",
                "Se\u00f1or del anillos, la comunidad del anillo (Pel\u00edcula)"
            ],
            "_version_": 1759782541458407426,
            "author_facet": [
                "OL475982A Brian Sibley"
            ],
            "subject_key": [
                "fantasy_films",
                "fantasy_films_history_and_criticism",
                "libros_de_l\u00e1minas",
                "lord_of_the_rings",
                "lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "middle_earth_(imaginary_place)",
                "motion_pictures_setting_and_scenery",
                "pel\u00edculas_fant\u00e1sticas",
                "pictorial_works",
                "se\u00f1or_del_anillos_la_comunidad_del_anillo_(pel\u00edcula)"
            ]
        },
        {
            "key": "/works/OL22043632W",
            "type": "work",
            "seed": [
                "/books/OL40435263M",
                "/books/OL30072155M",
                "/books/OL34136608M",
                "/books/OL34156463M",
                "/books/OL34176400M",
                "/works/OL22043632W",
                "/authors/OL2858670A",
                "/authors/OL5374162A"
            ],
            "title": "Finding God in the Lord of the Rings",
            "title_suggest": "Finding God in the Lord of the Rings",
            "title_sort": "Finding God in the Lord of the Rings",
            "edition_count": 5,
            "edition_key": [
                "OL40435263M",
                "OL30072155M",
                "OL34136608M",
                "OL34156463M",
                "OL34176400M"
            ],
            "publish_date": [
                "2021",
                "Sep 19, 2003"
            ],
            "publish_year": [
                2003,
                2021
            ],
            "first_publish_year": 2003,
            "number_of_pages_median": 136,
            "isbn": [
                "9780842385558",
                "9781496447494",
                "9781496447517",
                "1496447514",
                "1496447492",
                "1496447484",
                "9781496447500",
                "084238555X",
                "1496447506",
                "9781496447487"
            ],
            "last_modified_i": 1675188698,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL30072155M",
            "cover_i": 13177595,
            "publisher": [
                "Tyndale House Publishers",
                "Tyndale Momentum",
                "Brand: Living Books"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL2858670A",
                "OL5374162A"
            ],
            "author_name": [
                "Kurt Bruner",
                "Jim Ware"
            ],
            "publisher_facet": [
                "Brand: Living Books",
                "Tyndale House Publishers",
                "Tyndale Momentum"
            ],
            "_version_": 1759765306642792448,
            "author_facet": [
                "OL2858670A Kurt Bruner",
                "OL5374162A Jim Ware"
            ]
        },
        {
            "key": "/works/OL8937755W",
            "type": "work",
            "seed": [
                "/books/OL22741927M",
                "/books/OL8773280M",
                "/books/OL8773281M",
                "/works/OL8937755W",
                "/authors/OL3091153A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 3,
            "edition_key": [
                "OL22741927M",
                "OL8773280M",
                "OL8773281M"
            ],
            "publish_date": [
                "November 1, 2006"
            ],
            "publish_year": [
                2006
            ],
            "first_publish_year": 2006,
            "number_of_pages_median": 224,
            "publish_place": [
                "LONDON"
            ],
            "isbn": [
                "1904764827",
                "9781904764830",
                "1904764835",
                "9781904764823"
            ],
            "last_modified_i": 1564579505,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL8773280M",
            "cover_i": 2111453,
            "publisher": [
                "Wallflower Press",
                "WALLFLOWER"
            ],
            "language": [
                "und",
                "eng"
            ],
            "author_key": [
                "OL3091153A"
            ],
            "author_name": [
                "Ernest Mathijs"
            ],
            "id_goodreads": [
                "222930",
                "1982337"
            ],
            "id_librarything": [
                "3706961"
            ],
            "publisher_facet": [
                "WALLFLOWER",
                "Wallflower Press"
            ],
            "_version_": 1759802727863418880,
            "author_facet": [
                "OL3091153A Ernest Mathijs"
            ]
        },
        {
            "key": "/works/OL28830902W",
            "type": "work",
            "seed": [
                "/books/OL42871495M",
                "/books/OL39619673M",
                "/books/OL39632748M",
                "/works/OL28830902W",
                "/authors/OL10659931A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 3,
            "edition_key": [
                "OL42871495M",
                "OL39619673M",
                "OL39632748M"
            ],
            "publish_date": [
                "Dec 04, 1999",
                "2010"
            ],
            "publish_year": [
                1999,
                2010
            ],
            "first_publish_year": 1999,
            "isbn": [
                "8956371830",
                "8956371822",
                "9788956371832",
                "9788956371825",
                "9780261103931",
                "0261103938"
            ],
            "last_modified_i": 1675217864,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL39632748M",
            "cover_i": 13183063,
            "publisher": [
                "Siat Publishing Company",
                "Harper Collins"
            ],
            "language": [
                "kor"
            ],
            "author_key": [
                "OL10659931A"
            ],
            "author_name": [
                "J. R. R. Tolkien"
            ],
            "publisher_facet": [
                "Harper Collins",
                "Siat Publishing Company"
            ],
            "_version_": 1759778778753531905,
            "author_facet": [
                "OL10659931A J. R. R. Tolkien"
            ]
        },
        {
            "key": "/works/OL2347684W",
            "type": "work",
            "seed": [
                "/books/OL10317216M",
                "/books/OL10317217M",
                "/books/OL39581788M",
                "/works/OL2347684W",
                "/subjects/university_of_wisconsin",
                "/subjects/boxing",
                "/subjects/sports_&_recreation",
                "/subjects/sports",
                "/subjects/college_sports",
                "/subjects/history",
                "/subjects/university_of_wisconsin",
                "/subjects/boxing_history",
                "/subjects/madison_(wis.)_history",
                "/authors/OL317745A"
            ],
            "title": "Lords of the Ring",
            "title_suggest": "Lords of the Ring",
            "title_sort": "Lords of the Ring",
            "edition_count": 3,
            "edition_key": [
                "OL10317216M",
                "OL10317217M",
                "OL39581788M"
            ],
            "publish_date": [
                "September 22, 2004",
                "2012",
                "September 14, 2005"
            ],
            "publish_year": [
                2004,
                2012,
                2005
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 262,
            "lccn": [
                "2004005363"
            ],
            "oclc": [
                "149469555",
                "54677827"
            ],
            "lcc": [
                "GV-1125.00000000.M64 2004",
                "GV-1125.00000000"
            ],
            "isbn": [
                "9780299204204",
                "0299204243",
                "9780299204242",
                "9780299204235",
                "0299204235",
                "0299204200"
            ],
            "last_modified_i": 1663464974,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "isbn_9780299204204"
            ],
            "ia_collection": [
                "americana",
                "belmont-ol",
                "dartmouthlibrary-ol",
                "inlibrary",
                "internetarchivebooks",
                "openlibraryscanningteam",
                "printdisabled",
                "rochester-ol",
                "universityofarizona-ol"
            ],
            "ia_collection_s": "americana;belmont-ol;dartmouthlibrary-ol;inlibrary;internetarchivebooks;openlibraryscanningteam;printdisabled;rochester-ol;universityofarizona-ol",
            "lending_edition_s": "OL10317216M",
            "lending_identifier_s": "isbn_9780299204204",
            "printdisabled_s": "OL10317216M",
            "readinglog_count": 3,
            "want_to_read_count": 3,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL10317217M",
            "cover_i": 2353908,
            "publisher": [
                "University of Wisconsin Press"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL317745A"
            ],
            "author_name": [
                "Doug Moe"
            ],
            "subject": [
                "University of Wisconsin",
                "Boxing",
                "SPORTS & RECREATION",
                "Sports",
                "College sports",
                "History",
                "University of wisconsin",
                "Boxing, history",
                "Madison (wis.), history"
            ],
            "id_goodreads": [
                "442134",
                "883933"
            ],
            "id_librarything": [
                "4719431"
            ],
            "ia_box_id": [
                "IA1675801"
            ],
            "publisher_facet": [
                "University of Wisconsin Press"
            ],
            "subject_facet": [
                "Boxing",
                "Boxing, history",
                "College sports",
                "History",
                "Madison (wis.), history",
                "SPORTS & RECREATION",
                "Sports",
                "University of Wisconsin",
                "University of wisconsin"
            ],
            "_version_": 1759768215536271361,
            "lcc_sort": "GV-1125.00000000.M64 2004",
            "author_facet": [
                "OL317745A Doug Moe"
            ],
            "subject_key": [
                "boxing",
                "boxing_history",
                "college_sports",
                "history",
                "madison_(wis.)_history",
                "sports",
                "sports__recreation",
                "university_of_wisconsin"
            ]
        },
        {
            "key": "/works/OL13513933W",
            "type": "work",
            "seed": [
                "/books/OL21991871M",
                "/books/OL9216965M",
                "/books/OL7262250M",
                "/works/OL13513933W",
                "/subjects/adaptations",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL6382265A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 3,
            "edition_key": [
                "OL21991871M",
                "OL9216965M",
                "OL7262250M"
            ],
            "publish_date": [
                "November 6, 2002",
                "2002"
            ],
            "publish_year": [
                2002
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 48,
            "publish_place": [
                "London"
            ],
            "ddc": [
                "791.4372"
            ],
            "isbn": [
                "0007144091",
                "9780007144099"
            ],
            "last_modified_i": 1670640185,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL9216965M",
            "cover_i": 10450,
            "publisher": [
                "Collins"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL6382265A"
            ],
            "author_name": [
                "David Brawn"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "Adaptations"
            ],
            "id_amazon": [
                ""
            ],
            "id_goodreads": [
                "1859716"
            ],
            "id_librarything": [
                "790603"
            ],
            "publisher_facet": [
                "Collins"
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "Adaptations"
            ],
            "_version_": 1759748680383987712,
            "author_facet": [
                "OL6382265A David Brawn"
            ],
            "subject_key": [
                "adaptations"
            ],
            "ddc_sort": "791.4372"
        },
        {
            "key": "/works/OL26424627W",
            "type": "work",
            "seed": [
                "/books/OL35688477M",
                "/books/OL37175817M",
                "/books/OL35869097M",
                "/works/OL26424627W",
                "/authors/OL26320A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 3,
            "edition_key": [
                "OL35688477M",
                "OL37175817M",
                "OL35869097M"
            ],
            "publish_date": [
                "Sep 30, 2002",
                "2013",
                "2021"
            ],
            "publish_year": [
                2002,
                2013,
                2021
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 1124,
            "isbn": [
                "0008501319",
                "9781299884953",
                "1299884954",
                "9780618260294",
                "9780008501310",
                "0618260293"
            ],
            "last_modified_i": 1661341253,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 6,
            "want_to_read_count": 6,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL35688477M",
            "cover_i": 12388843,
            "publisher": [
                "Brand: Mariner Books",
                "HarperCollins Publishers Limited",
                "Houghton Mifflin",
                "Houghton Mifflin Harcourt Trade & Reference Publishers"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL26320A"
            ],
            "author_name": [
                "J.R.R. Tolkien"
            ],
            "author_alternative_name": [
                "J. R. R. Tolkien",
                "Dzhon R. R. Tolkin",
                "J. R. R. Tolkein",
                "Yue Han Luo Na De Rui Er Tuo Er Jin",
                "J.R.R. Tolkein",
                "John Ronald Reuel Tolkien"
            ],
            "publisher_facet": [
                "Brand: Mariner Books",
                "HarperCollins Publishers Limited",
                "Houghton Mifflin",
                "Houghton Mifflin Harcourt Trade & Reference Publishers"
            ],
            "_version_": 1759773916815949824,
            "author_facet": [
                "OL26320A J.R.R. Tolkien"
            ]
        },
        {
            "key": "/works/OL5753836W",
            "type": "work",
            "seed": [
                "/books/OL3949131M",
                "/books/OL22074077M",
                "/books/OL3670507M",
                "/works/OL5753836W",
                "/subjects/lord_of_the_rings:_the_two_towers_(motion_picture)",
                "/subjects/film_and_video_adaptations",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "/subjects/lord_of_the_rings_the_two_towers_(motion_picture)",
                "/subjects/illustrations",
                "/subjects/pictorial_works",
                "/subjects/art_and_motion_pictures",
                "/subjects/middle_earth_(imaginary_place)_in_motion_pictures",
                "/subjects/lord_of_the_rings",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/fantasy_fiction_history_and_criticism",
                "/subjects/fantasy_films",
                "/subjects/motion_pictures_setting_and_scenery",
                "/subjects/fantasy_films_history_and_criticism",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL1399851A"
            ],
            "title": "The lord of the rings",
            "title_suggest": "The lord of the rings",
            "title_sort": "The lord of the rings",
            "edition_count": 3,
            "edition_key": [
                "OL3949131M",
                "OL22074077M",
                "OL3670507M"
            ],
            "publish_date": [
                "2002",
                "2001"
            ],
            "publish_year": [
                2002,
                2001
            ],
            "first_publish_year": 2001,
            "number_of_pages_median": 63,
            "lccn": [
                "2002726993",
                "2001039533"
            ],
            "publish_place": [
                "London",
                "Boston"
            ],
            "oclc": [
                "50917436"
            ],
            "contributor": [
                "Tolkien, J. R. R. 1892-1973."
            ],
            "lcc": [
                "PN-1997.00000000",
                "PR-6039.00000000.O32F4 2001",
                "PN-1997.20000000.L678 F58 2002",
                "PR-6039.00000000.O32 F4 2001"
            ],
            "ddc": [
                "823.92",
                "791.4372"
            ],
            "isbn": [
                "0618258027",
                "0618154019",
                "9780618154012",
                "9780618258024",
                "9780007116256",
                "000711625X"
            ],
            "last_modified_i": 1673793465,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringsfello00fish"
            ],
            "ia_collection": [
                "bpljordan-ol",
                "china",
                "inlibrary",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "bpljordan-ol;china;inlibrary;internetarchivebooks;printdisabled",
            "lending_edition_s": "OL3949131M",
            "lending_identifier_s": "lordofringsfello00fish",
            "printdisabled_s": "OL3949131M",
            "readinglog_count": 10,
            "want_to_read_count": 7,
            "currently_reading_count": 1,
            "already_read_count": 2,
            "cover_edition_key": "OL3670507M",
            "cover_i": 393983,
            "publisher": [
                "HarperCollins",
                "Houghton Mifflin"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL1399851A"
            ],
            "author_name": [
                "Jude Fisher"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "Lord of the Rings: The two towers (Motion picture)",
                "Film and video adaptations",
                "Middle Earth (Imaginary place)",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Illustrations",
                "Pictorial works",
                "Art and motion pictures",
                "Middle Earth (Imaginary place) in motion pictures",
                "Lord of the rings",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Middle earth (imaginary place)",
                "Fantasy fiction, history and criticism",
                "Fantasy films",
                "Motion pictures, setting and scenery",
                "Fantasy films, history and criticism"
            ],
            "id_goodreads": [
                "15222",
                "93936",
                "15221"
            ],
            "id_librarything": [
                "86479",
                "121443"
            ],
            "ia_loaded_id": [
                "lordofringsfello00fish"
            ],
            "ia_box_id": [
                "IA177101"
            ],
            "publisher_facet": [
                "HarperCollins",
                "Houghton Mifflin"
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "Art and motion pictures",
                "Fantasy fiction, history and criticism",
                "Fantasy films",
                "Fantasy films, history and criticism",
                "Film and video adaptations",
                "Illustrations",
                "Lord of the Rings: The two towers (Motion picture)",
                "Lord of the rings",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Middle Earth (Imaginary place)",
                "Middle Earth (Imaginary place) in motion pictures",
                "Middle earth (imaginary place)",
                "Motion pictures, setting and scenery",
                "Pictorial works",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "_version_": 1759795572635598850,
            "lcc_sort": "PN-1997.20000000.L678 F58 2002",
            "author_facet": [
                "OL1399851A Jude Fisher"
            ],
            "subject_key": [
                "art_and_motion_pictures",
                "fantasy_fiction_history_and_criticism",
                "fantasy_films",
                "fantasy_films_history_and_criticism",
                "film_and_video_adaptations",
                "illustrations",
                "lord_of_the_rings",
                "lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "lord_of_the_rings_the_two_towers_(motion_picture)",
                "middle_earth_(imaginary_place)",
                "middle_earth_(imaginary_place)_in_motion_pictures",
                "motion_pictures_setting_and_scenery",
                "pictorial_works",
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973"
            ],
            "ddc_sort": "791.4372"
        },
        {
            "key": "/works/OL5747799W",
            "type": "work",
            "seed": [
                "/books/OL3670710M",
                "/books/OL3670562M",
                "/books/OL22034985M",
                "/works/OL5747799W",
                "/subjects/lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "/subjects/lord_of_the_rings_the_two_towers_(motion_picture)",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/fantasy_fiction_history_and_criticism",
                "/subjects/juvenile_literature",
                "/authors/OL1398136A"
            ],
            "title": "The Lord of the rings",
            "title_suggest": "The Lord of the rings",
            "title_sort": "The Lord of the rings",
            "edition_count": 3,
            "edition_key": [
                "OL3670710M",
                "OL3670562M",
                "OL22034985M"
            ],
            "publish_date": [
                "2002",
                "2003"
            ],
            "publish_year": [
                2002,
                2003
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 48,
            "lccn": [
                "2002727063",
                "2002727306"
            ],
            "publish_place": [
                "London",
                "New York"
            ],
            "oclc": [
                "51006684",
                "50995977"
            ],
            "contributor": [
                "Vinet, Pierre.",
                "Coad, Chris."
            ],
            "lcc": [
                "PN-1997.20000000.L67 B75 2003",
                "PN-1997.20000000.L678 B76 2002",
                "PN-1997.20000000.L678 B73 2002"
            ],
            "ddc": [
                "823.912",
                "791.4372"
            ],
            "isbn": [
                "9780618258116",
                "0618258116",
                "0007170564",
                "9780007170562",
                "0618257365",
                "9780618257362"
            ],
            "last_modified_i": 1673806154,
            "ebook_count_i": 2,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringstwoto0000braw_z3j8",
                "lordofringsretur0000braw"
            ],
            "ia_collection": [
                "inlibrary",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "inlibrary;internetarchivebooks;printdisabled",
            "lending_edition_s": "OL3670710M",
            "lending_identifier_s": "lordofringstwoto0000braw_z3j8",
            "printdisabled_s": "OL3670710M;OL22034985M",
            "cover_edition_key": "OL3670562M",
            "cover_i": 393986,
            "publisher": [
                "Collins",
                "Houghton Mifflin"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL1398136A"
            ],
            "author_name": [
                "David Brawn"
            ],
            "subject": [
                "Lord of the rings, the return of the king (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Middle earth (imaginary place)",
                "Fantasy fiction, history and criticism",
                "Juvenile literature"
            ],
            "id_amazon": [
                ""
            ],
            "id_goodreads": [
                "15327",
                "15335",
                "15266"
            ],
            "id_librarything": [
                "313188",
                "26037",
                "790603"
            ],
            "ia_box_id": [
                "IA1914721",
                "IA40204706"
            ],
            "publisher_facet": [
                "Collins",
                "Houghton Mifflin"
            ],
            "subject_facet": [
                "Fantasy fiction, history and criticism",
                "Juvenile literature",
                "Lord of the rings, the return of the king (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Middle earth (imaginary place)"
            ],
            "_version_": 1759795687274315778,
            "lcc_sort": "PN-1997.20000000.L678 B76 2002",
            "author_facet": [
                "OL1398136A David Brawn"
            ],
            "subject_key": [
                "fantasy_fiction_history_and_criticism",
                "juvenile_literature",
                "lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "lord_of_the_rings_the_two_towers_(motion_picture)",
                "middle_earth_(imaginary_place)"
            ],
            "ddc_sort": "791.4372"
        },
        {
            "key": "/works/OL2089932W",
            "type": "work",
            "seed": [
                "/books/OL40208842M",
                "/books/OL8184572M",
                "/books/OL36254613M",
                "/works/OL2089932W",
                "/subjects/moravians",
                "/subjects/biography",
                "/authors/OL257300A"
            ],
            "title": "The Lord of the Ring",
            "title_suggest": "The Lord of the Ring",
            "title_sort": "The Lord of the Ring",
            "edition_count": 3,
            "edition_key": [
                "OL40208842M",
                "OL8184572M",
                "OL36254613M"
            ],
            "publish_date": [
                "2021",
                "Nov 03, 2006",
                "April 5, 2007"
            ],
            "publish_year": [
                2021,
                2006,
                2007
            ],
            "first_publish_year": 2006,
            "number_of_pages_median": 207,
            "lccn": [
                "2006034786"
            ],
            "oclc": [
                "74649012"
            ],
            "lcc": [
                "BX-8593.00000000.Z6 A68 2007"
            ],
            "isbn": [
                "1910012335",
                "9780830743278",
                "0830743278",
                "9781842913260",
                "1842913263",
                "9781910012338"
            ],
            "last_modified_i": 1670150600,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofring0000ande"
            ],
            "ia_collection": [
                "inlibrary",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "inlibrary;internetarchivebooks;printdisabled",
            "lending_edition_s": "OL8184572M",
            "lending_identifier_s": "lordofring0000ande",
            "printdisabled_s": "OL8184572M",
            "readinglog_count": 4,
            "want_to_read_count": 3,
            "currently_reading_count": 0,
            "already_read_count": 1,
            "cover_edition_key": "OL8184572M",
            "cover_i": 1576186,
            "publisher": [
                "Muddy Pearl",
                "Kingsway Publications",
                "Regal Books"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL257300A"
            ],
            "author_name": [
                "Phil Anderson"
            ],
            "subject": [
                "Moravians",
                "Biography"
            ],
            "id_goodreads": [
                "15392"
            ],
            "id_librarything": [
                "2041767"
            ],
            "ia_box_id": [
                "IA40772315"
            ],
            "publisher_facet": [
                "Kingsway Publications",
                "Muddy Pearl",
                "Regal Books"
            ],
            "subject_facet": [
                "Biography",
                "Moravians"
            ],
            "_version_": 1759763150016610305,
            "lcc_sort": "BX-8593.00000000.Z6 A68 2007",
            "author_facet": [
                "OL257300A Phil Anderson"
            ],
            "subject_key": [
                "biography",
                "moravians"
            ]
        },
        {
            "key": "/works/OL3062799W",
            "type": "work",
            "seed": [
                "/books/OL11759646M",
                "/books/OL3953584M",
                "/books/OL23247000M",
                "/works/OL3062799W",
                "/subjects/english_fantasy_fiction",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/history_and_criticism",
                "/subjects/handbooks_manuals",
                "/subjects/fantasy_fiction_english",
                "/subjects/handbooks_manuals_etc",
                "/subjects/fantasy_fiction_history_and_criticism",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL475982A"
            ],
            "title": "The lord of the rings",
            "title_suggest": "The lord of the rings",
            "title_sort": "The lord of the rings",
            "edition_count": 3,
            "edition_key": [
                "OL11759646M",
                "OL3953584M",
                "OL23247000M"
            ],
            "publish_date": [
                "2002",
                "2001",
                "November 2001"
            ],
            "publish_year": [
                2002,
                2001
            ],
            "first_publish_year": 2001,
            "number_of_pages_median": 144,
            "lccn": [
                "2001051586"
            ],
            "publish_place": [
                "New York, N.Y",
                "Boston"
            ],
            "contributor": [
                "Tolkien, J. R. R. 1892-1973."
            ],
            "lcc": [
                "PR-6039.00000000.O32L63716",
                "PR-6039.00000000.O32 L63716 2001"
            ],
            "ddc": [
                "823.912"
            ],
            "isbn": [
                "0618258000",
                "1417605103",
                "9780618195596",
                "0618195599",
                "9781417605101",
                "0618260226",
                "9780618258000",
                "9780618260225"
            ],
            "last_modified_i": 1677596235,
            "ebook_count_i": 2,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringsinsid00sibl",
                "lordofringsmakin00sibl"
            ],
            "ia_collection": [
                "belmont-ol",
                "binghamton-ol",
                "china",
                "cnusd-ol",
                "inlibrary",
                "internetarchivebooks",
                "openlibrary-d-ol",
                "printdisabled",
                "stmaryscountylibrary"
            ],
            "ia_collection_s": "belmont-ol;binghamton-ol;china;cnusd-ol;inlibrary;internetarchivebooks;openlibrary-d-ol;printdisabled;stmaryscountylibrary",
            "lending_edition_s": "OL3953584M",
            "lending_identifier_s": "lordofringsinsid00sibl",
            "printdisabled_s": "OL3953584M;OL23247000M",
            "readinglog_count": 16,
            "want_to_read_count": 14,
            "currently_reading_count": 1,
            "already_read_count": 1,
            "cover_edition_key": "OL3953584M",
            "cover_i": 393721,
            "publisher": [
                "Houghton Mifflin",
                "Tandem Library",
                "Mariner Books",
                "Houghton Mifflin Company"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL475982A"
            ],
            "author_name": [
                "Brian Sibley"
            ],
            "author_alternative_name": [
                "Brian David Sibley"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "English Fantasy fiction",
                "Middle Earth (Imaginary place)",
                "History and criticism",
                "Handbooks, manuals",
                "Fantasy fiction, English",
                "Handbooks, manuals, etc",
                "Fantasy fiction, history and criticism"
            ],
            "id_goodreads": [
                "470271",
                "780852",
                "7351",
                "15390"
            ],
            "id_librarything": [
                "76320",
                "181567"
            ],
            "ia_loaded_id": [
                "lordofringsinsid00sibl"
            ],
            "ia_box_id": [
                "IA179701",
                "IA1124908"
            ],
            "publisher_facet": [
                "Houghton Mifflin",
                "Houghton Mifflin Company",
                "Mariner Books",
                "Tandem Library"
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "English Fantasy fiction",
                "Fantasy fiction, English",
                "Fantasy fiction, history and criticism",
                "Handbooks, manuals",
                "Handbooks, manuals, etc",
                "History and criticism",
                "Middle Earth (Imaginary place)"
            ],
            "_version_": 1759880696198856706,
            "lcc_sort": "PR-6039.00000000.O32 L63716 2001",
            "author_facet": [
                "OL475982A Brian Sibley"
            ],
            "subject_key": [
                "english_fantasy_fiction",
                "fantasy_fiction_english",
                "fantasy_fiction_history_and_criticism",
                "handbooks_manuals",
                "handbooks_manuals_etc",
                "history_and_criticism",
                "middle_earth_(imaginary_place)"
            ],
            "ddc_sort": "823.912"
        },
        {
            "key": "/works/OL4442132W",
            "type": "work",
            "seed": [
                "/books/OL3953527M",
                "/books/OL9218622M",
                "/books/OL7263907M",
                "/books/OL22143692M",
                "/works/OL4442132W",
                "/subjects/lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "/subjects/lord_of_the_rings_the_two_towers_(motion_picture)",
                "/subjects/lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "/subjects/illustrations",
                "/subjects/pictorial_works",
                "/subjects/fantasy_fiction_history_and_criticism",
                "/subjects/characters_and_characteristics_in_literature",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL883989A"
            ],
            "title": "The Lord of the Rings The Fellowship of the Ring Photo Guide",
            "title_suggest": "The Lord of the Rings The Fellowship of the Ring Photo Guide",
            "title_sort": "The Lord of the Rings The Fellowship of the Ring Photo Guide",
            "edition_count": 4,
            "edition_key": [
                "OL3953527M",
                "OL9218622M",
                "OL7263907M",
                "OL22143692M"
            ],
            "publish_date": [
                "November 1, 2004",
                "2001",
                "2004"
            ],
            "publish_year": [
                2001,
                2004
            ],
            "first_publish_year": 2001,
            "number_of_pages_median": 160,
            "lccn": [
                "2001051475"
            ],
            "publish_place": [
                "Boston",
                "London"
            ],
            "oclc": [
                "48495122"
            ],
            "contributor": [
                "Brawn, David."
            ],
            "lcc": [
                "PN-1997.20000000.L679 S24 2004",
                "PR-6039.00000000.O32 F48 2001",
                "PR-6039.00000000.O32F48 2001"
            ],
            "ddc": [
                "823.912"
            ],
            "isbn": [
                "9780007198948",
                "0618195580",
                "0007198949",
                "9780618195589"
            ],
            "last_modified_i": 1677598098,
            "ebook_count_i": 2,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringsfello00sage",
                "lordofringstrilo0000sage"
            ],
            "ia_collection": [
                "china",
                "inlibrary",
                "internetarchivebooks",
                "openlibrary-d-ol",
                "printdisabled"
            ],
            "ia_collection_s": "china;inlibrary;internetarchivebooks;openlibrary-d-ol;printdisabled",
            "lending_edition_s": "OL3953527M",
            "lending_identifier_s": "lordofringsfello00sage",
            "printdisabled_s": "OL3953527M;OL22143692M",
            "readinglog_count": 2,
            "want_to_read_count": 2,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL3953527M",
            "cover_i": 393720,
            "publisher": [
                "Houghton Mifflin",
                "HarperCollinsChildren'sBooks",
                "Mariner Books",
                "Collins"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL883989A"
            ],
            "author_name": [
                "Alison Sage"
            ],
            "author_alternative_name": [
                "Alison, Ed. Foreword By Quentin Blake Sage"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Illustrations",
                "Pictorial works",
                "Fantasy fiction, history and criticism",
                "Characters and characteristics in literature"
            ],
            "id_goodreads": [
                "426269",
                "15284"
            ],
            "id_librarything": [
                "1173889",
                "86478"
            ],
            "ia_loaded_id": [
                "lordofringsfello00sage"
            ],
            "ia_box_id": [
                "IA40052319",
                "IA118306"
            ],
            "publisher_facet": [
                "Collins",
                "HarperCollinsChildren'sBooks",
                "Houghton Mifflin",
                "Mariner Books"
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "Characters and characteristics in literature",
                "Fantasy fiction, history and criticism",
                "Illustrations",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Pictorial works"
            ],
            "_version_": 1759882034013011970,
            "lcc_sort": "PN-1997.20000000.L679 S24 2004",
            "author_facet": [
                "OL883989A Alison Sage"
            ],
            "subject_key": [
                "characters_and_characteristics_in_literature",
                "fantasy_fiction_history_and_criticism",
                "illustrations",
                "lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "lord_of_the_rings_the_two_towers_(motion_picture)",
                "pictorial_works"
            ],
            "ddc_sort": "823.912"
        },
        {
            "key": "/works/OL12693815W",
            "type": "work",
            "seed": [
                "/books/OL21992239M",
                "/books/OL32170709M",
                "/books/OL32170710M",
                "/books/OL27646101M",
                "/works/OL12693815W",
                "/subjects/guidebooks",
                "/subjects/motion_picture_locations",
                "/subjects/lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "/subjects/lord_of_the_rings_the_two_towers_(motion_picture)",
                "/subjects/lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "/subjects/travel_and_tourism",
                "/subjects/cinema",
                "/authors/OL5676501A"
            ],
            "title": "The Lord of the rings location guidebook",
            "title_suggest": "The Lord of the rings location guidebook",
            "title_sort": "The Lord of the rings location guidebook",
            "edition_count": 4,
            "edition_key": [
                "OL21992239M",
                "OL32170709M",
                "OL32170710M",
                "OL27646101M"
            ],
            "publish_date": [
                "2002",
                "Nov 01, 2011"
            ],
            "publish_year": [
                2011,
                2002
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 128,
            "lccn": [
                "2003363017"
            ],
            "publish_place": [
                "Auckland"
            ],
            "oclc": [
                "56197159"
            ],
            "lcc": [
                "DU-0405.50000000.B76 2002",
                "PN-1997.00000000"
            ],
            "isbn": [
                "9781869504526",
                "1869509277",
                "9781869509262",
                "9781869509279",
                "1869504526",
                "1869509269"
            ],
            "last_modified_i": 1677603232,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringslocat0000brod"
            ],
            "ia_collection": [
                "inlibrary",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "inlibrary;internetarchivebooks;printdisabled",
            "lending_edition_s": "OL21992239M",
            "lending_identifier_s": "lordofringslocat0000brod",
            "printdisabled_s": "OL21992239M",
            "readinglog_count": 0,
            "want_to_read_count": 0,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL21992239M",
            "cover_i": 11406366,
            "publisher": [
                "HarperCollins Publishers Ltd",
                "HarperCollins (New Zealand)",
                "HarperCollins"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL5676501A"
            ],
            "author_name": [
                "Ian Brodie"
            ],
            "subject": [
                "Guidebooks",
                "Motion picture locations",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Travel and tourism",
                "Cinema"
            ],
            "id_amazon": [
                "1869509277"
            ],
            "id_librarything": [
                "241932"
            ],
            "ia_box_id": [
                "IA40116407"
            ],
            "publisher_facet": [
                "HarperCollins",
                "HarperCollins (New Zealand)",
                "HarperCollins Publishers Ltd"
            ],
            "subject_facet": [
                "Cinema",
                "Guidebooks",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Motion picture locations",
                "Travel and tourism"
            ],
            "_version_": 1759885158210600961,
            "lcc_sort": "DU-0405.50000000.B76 2002",
            "author_facet": [
                "OL5676501A Ian Brodie"
            ],
            "subject_key": [
                "cinema",
                "guidebooks",
                "lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "lord_of_the_rings_the_two_towers_(motion_picture)",
                "motion_picture_locations",
                "travel_and_tourism"
            ]
        },
        {
            "key": "/works/OL8488047W",
            "type": "work",
            "seed": [
                "/books/OL9377247M",
                "/books/OL8005697M",
                "/books/OL10872494M",
                "/works/OL8488047W",
                "/subjects/instrumental_music",
                "/subjects/motion_picture_music",
                "/subjects/piano_music",
                "/subjects/trombone",
                "/authors/OL2834626A"
            ],
            "title": "Lord of the Rings Instrumental",
            "title_suggest": "Lord of the Rings Instrumental",
            "title_sort": "Lord of the Rings Instrumental",
            "edition_count": 3,
            "edition_key": [
                "OL9377247M",
                "OL8005697M",
                "OL10872494M"
            ],
            "publish_date": [
                "August 2004"
            ],
            "publish_year": [
                2004
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 28,
            "isbn": [
                "0757923283",
                "9780757923289",
                "0757923267",
                "9780757923265",
                "9780757923272",
                "0757923275"
            ],
            "last_modified_i": 1640394785,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL10872494M",
            "cover_i": 2601070,
            "publisher": [
                "Warner Bros. Publications"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL2834626A"
            ],
            "author_name": [
                "Howard Shore"
            ],
            "subject": [
                "Instrumental music",
                "Motion picture music",
                "Piano music",
                "Trombone"
            ],
            "id_goodreads": [
                "840091",
                "2054334",
                "2091050"
            ],
            "id_librarything": [
                "1839597",
                "3033505"
            ],
            "publisher_facet": [
                "Warner Bros. Publications"
            ],
            "subject_facet": [
                "Instrumental music",
                "Motion picture music",
                "Piano music",
                "Trombone"
            ],
            "_version_": 1759801579194548224,
            "author_facet": [
                "OL2834626A Howard Shore"
            ],
            "subject_key": [
                "instrumental_music",
                "motion_picture_music",
                "piano_music",
                "trombone"
            ]
        },
        {
            "key": "/works/OL27438W",
            "type": "work",
            "seed": [
                "/books/OL9131861M",
                "/books/OL25449052M",
                "/books/OL25175082M",
                "/works/OL27438W",
                "/subjects/fiction",
                "/subjects/ficci\u00f3n",
                "/subjects/english_fantasy_fiction",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/baggins_frodo_(personaje_literario)",
                "/subjects/tierra_media_(lugar_imaginario)",
                "/subjects/frodo_baggins_(fictitious_character)",
                "/subjects/ficci\u00f3n_fant\u00e1stica_inglesa",
                "/authors/OL26320A"
            ],
            "title": "The Lord of the Rings. Appendices",
            "title_suggest": "The Lord of the Rings. Appendices",
            "title_sort": "The Lord of the Rings. Appendices",
            "edition_count": 3,
            "edition_key": [
                "OL9131861M",
                "OL25449052M",
                "OL25175082M"
            ],
            "publish_date": [
                "July 1995",
                "2002"
            ],
            "publish_year": [
                1995,
                2002
            ],
            "first_publish_year": 1995,
            "number_of_pages_median": 180,
            "publish_place": [
                "Madrid, Espa\u00f1a",
                "Barcelona, Spain"
            ],
            "oclc": [
                "434452700"
            ],
            "isbn": [
                "842269283X",
                "9789505471225",
                "8439596189",
                "8445070703",
                "9788439596189",
                "8439597495",
                "9788445070703",
                "950547122X",
                "9788422692836",
                "9788439597490"
            ],
            "last_modified_i": 1676552379,
            "ebook_count_i": 1,
            "ebook_access": "printdisabled",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "elseordelosanill00jrrt_0"
            ],
            "ia_collection": [
                "bannedbooks",
                "china",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "bannedbooks;china;internetarchivebooks;printdisabled",
            "printdisabled_s": "OL9131861M",
            "ratings_count_1": 0,
            "ratings_count_2": 0,
            "ratings_count_3": 0,
            "ratings_count_4": 2,
            "ratings_count_5": 0,
            "ratings_average": 4.0,
            "ratings_sortable": 2.5403202,
            "ratings_count": 2,
            "readinglog_count": 5,
            "want_to_read_count": 3,
            "currently_reading_count": 0,
            "already_read_count": 2,
            "cover_edition_key": "OL9131861M",
            "cover_i": 8406792,
            "publisher": [
                "Ediciones Minotauro",
                "Minotauro",
                "Circulo de Lectores"
            ],
            "language": [
                "spa"
            ],
            "author_key": [
                "OL26320A"
            ],
            "author_name": [
                "J.R.R. Tolkien"
            ],
            "author_alternative_name": [
                "Dzhon R. R. Tolkin",
                "J. R. R. Tolkein",
                "J. R. R. Tolkien",
                "J.R.R. Tolkein",
                "Yue Han Luo Na De Rui Er Tuo Er Jin",
                "John Ronald Reuel Tolkien"
            ],
            "subject": [
                "Fiction",
                "Ficci\u00f3n",
                "English Fantasy fiction",
                "Middle Earth (Imaginary place)",
                "Baggins, Frodo (Personaje literario)",
                "Tierra Media (Lugar imaginario)",
                "Frodo Baggins (Fictitious character)",
                "Ficci\u00f3n fant\u00e1stica inglesa"
            ],
            "id_bcid": [
                "12797792"
            ],
            "id_goodreads": [
                "54694"
            ],
            "id_librarything": [
                "1386651"
            ],
            "ia_box_id": [
                "IA1149820"
            ],
            "publisher_facet": [
                "Circulo de Lectores",
                "Ediciones Minotauro",
                "Minotauro"
            ],
            "subject_facet": [
                "Baggins, Frodo (Personaje literario)",
                "English Fantasy fiction",
                "Ficci\u00f3n",
                "Ficci\u00f3n fant\u00e1stica inglesa",
                "Fiction",
                "Frodo Baggins (Fictitious character)",
                "Middle Earth (Imaginary place)",
                "Tierra Media (Lugar imaginario)"
            ],
            "_version_": 1759776134400049152,
            "author_facet": [
                "OL26320A J.R.R. Tolkien"
            ],
            "subject_key": [
                "baggins_frodo_(personaje_literario)",
                "english_fantasy_fiction",
                "ficci\u00f3n",
                "ficci\u00f3n_fant\u00e1stica_inglesa",
                "fiction",
                "frodo_baggins_(fictitious_character)",
                "middle_earth_(imaginary_place)",
                "tierra_media_(lugar_imaginario)"
            ]
        },
        {
            "key": "/works/OL17995090W",
            "type": "work",
            "seed": [
                "/books/OL11397176M",
                "/books/OL11397177M",
                "/books/OL17991485M",
                "/works/OL17995090W",
                "/subjects/history_and_criticism",
                "/subjects/lord_of_the_rings_films",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/subjects/motion_pictures_history",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL70705A",
                "/authors/OL3091153A"
            ],
            "title": "Watching the Lord of the rings",
            "title_suggest": "Watching the Lord of the rings",
            "title_sort": "Watching the Lord of the rings",
            "edition_count": 3,
            "edition_key": [
                "OL11397176M",
                "OL11397177M",
                "OL17991485M"
            ],
            "publish_date": [
                "November 2007",
                "2007"
            ],
            "publish_year": [
                2007
            ],
            "first_publish_year": 2007,
            "number_of_pages_median": 297,
            "lccn": [
                "2007024352"
            ],
            "publish_place": [
                "New York"
            ],
            "oclc": [
                "144570911"
            ],
            "contributor": [
                "Ernest Mathijs (Editor)",
                "Martin Barker (Editor)"
            ],
            "lcc": [
                "PN-1995.90000000.L58 W38 2008",
                "PN-1995.90000000.L58 B37 2007",
                "PN-1995.90000000.L58B37 2007"
            ],
            "ddc": [
                "791.4375"
            ],
            "isbn": [
                "9780820463964",
                "0820463965",
                "9780820463971",
                "0820463973"
            ],
            "last_modified_i": 1672345771,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "watchinglordofri0000unse"
            ],
            "ia_collection": [
                "gwulibraries-ol",
                "inlibrary",
                "internetarchivebooks",
                "printdisabled",
                "riceuniversity-ol",
                "the-claremont-colleges-ol",
                "trent_university",
                "universityofcoloradoboulder-ol",
                "universityofoklahoma-ol"
            ],
            "ia_collection_s": "gwulibraries-ol;inlibrary;internetarchivebooks;printdisabled;riceuniversity-ol;the-claremont-colleges-ol;trent_university;universityofcoloradoboulder-ol;universityofoklahoma-ol",
            "lending_edition_s": "OL11397177M",
            "lending_identifier_s": "watchinglordofri0000unse",
            "printdisabled_s": "OL11397177M",
            "cover_edition_key": "OL11397177M",
            "cover_i": 2653033,
            "publisher": [
                "P. Lang",
                "Peter Lang Pub Inc"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL70705A",
                "OL3091153A"
            ],
            "author_name": [
                "Martin Barker",
                "Ernest Mathijs"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "History and criticism",
                "Lord of the Rings films",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Motion pictures, history"
            ],
            "id_goodreads": [
                "2298532",
                "2775800"
            ],
            "id_librarything": [
                "5180018"
            ],
            "ia_box_id": [
                "IA1241204"
            ],
            "publisher_facet": [
                "P. Lang",
                "Peter Lang Pub Inc"
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "History and criticism",
                "Lord of the Rings films",
                "Motion pictures, history",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "_version_": 1759756879787982854,
            "lcc_sort": "PN-1995.90000000.L58 W38 2008",
            "author_facet": [
                "OL3091153A Ernest Mathijs",
                "OL70705A Martin Barker"
            ],
            "subject_key": [
                "history_and_criticism",
                "lord_of_the_rings_films",
                "motion_pictures_history",
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973"
            ],
            "ddc_sort": "791.4375"
        },
        {
            "key": "/works/OL9356256W",
            "type": "work",
            "seed": [
                "/books/OL21409258M",
                "/books/OL10222173M",
                "/works/OL9356256W",
                "/subjects/biography:_general",
                "/subjects/boxing",
                "/subjects/england",
                "/subjects/c_1980_to_c_1990",
                "/subjects/c_1990_to_c_2000",
                "/subjects/person:frank_warren_(1952-)",
                "/subjects/person:terry_marsh_(1958-)",
                "/authors/OL3399247A",
                "/authors/OL3399248A"
            ],
            "title": "Lords of the ring",
            "title_suggest": "Lords of the ring",
            "title_sort": "Lords of the ring",
            "edition_count": 2,
            "edition_key": [
                "OL21409258M",
                "OL10222173M"
            ],
            "publish_date": [
                "1991",
                "September 1991"
            ],
            "publish_year": [
                1991
            ],
            "first_publish_year": 1991,
            "number_of_pages_median": 268,
            "publish_place": [
                "London"
            ],
            "oclc": [
                "24743033"
            ],
            "contributor": [
                "Spillius, Alex."
            ],
            "ddc": [
                "796.8"
            ],
            "isbn": [
                "043473876X",
                "9780434738762"
            ],
            "last_modified_i": 1564531116,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "William Heinemann",
                "William Heinemann Ltd"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL3399247A",
                "OL3399248A"
            ],
            "author_name": [
                "Harry Lansdown",
                "Alex Spillius"
            ],
            "person": [
                "Frank Warren (1952-)",
                "Terry Marsh (1958-)"
            ],
            "subject": [
                "Biography: general",
                "Boxing",
                "England",
                "c 1980 to c 1990",
                "c 1990 to c 2000"
            ],
            "id_goodreads": [
                "883931"
            ],
            "publisher_facet": [
                "William Heinemann",
                "William Heinemann Ltd"
            ],
            "person_key": [
                "frank_warren_(1952-)",
                "terry_marsh_(1958-)"
            ],
            "person_facet": [
                "Frank Warren (1952-)",
                "Terry Marsh (1958-)"
            ],
            "subject_facet": [
                "Biography: general",
                "Boxing",
                "England",
                "c 1980 to c 1990",
                "c 1990 to c 2000"
            ],
            "_version_": 1759803556654743552,
            "author_facet": [
                "OL3399247A Harry Lansdown",
                "OL3399248A Alex Spillius"
            ],
            "subject_key": [
                "biography_general",
                "boxing",
                "c_1980_to_c_1990",
                "c_1990_to_c_2000",
                "england"
            ],
            "ddc_sort": "796.8"
        },
        {
            "key": "/works/OL32342746W",
            "type": "work",
            "seed": [
                "/books/OL44096247M",
                "/books/OL44095808M",
                "/works/OL32342746W",
                "/subjects/british_and_irish_fiction_(fictional_works_by_one_author)",
                "/subjects/middle_earth_(imaginary_place)_fiction",
                "/subjects/baggins_bilbo_(fictitious_character)_fiction",
                "/subjects/baggins_frodo_(fictitious_character)_fiction",
                "/subjects/gandalf_(fictitious_character)_fiction",
                "/authors/OL10659931A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 2,
            "edition_key": [
                "OL44096247M",
                "OL44095808M"
            ],
            "publish_date": [
                "1991",
                "2001"
            ],
            "publish_year": [
                1991,
                2001
            ],
            "first_publish_year": 1991,
            "isbn": [
                "9780007118366",
                "0261102567",
                "0007118368",
                "9780261102569"
            ],
            "last_modified_i": 1671246529,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "HarperCollins Publishers Limited"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL10659931A"
            ],
            "author_name": [
                "J. R. R. Tolkien"
            ],
            "subject": [
                "British and irish fiction (fictional works by one author)",
                "Middle earth (imaginary place), fiction",
                "Baggins, bilbo (fictitious character), fiction",
                "Baggins, frodo (fictitious character), fiction",
                "Gandalf (fictitious character), fiction"
            ],
            "publisher_facet": [
                "HarperCollins Publishers Limited"
            ],
            "subject_facet": [
                "Baggins, bilbo (fictitious character), fiction",
                "Baggins, frodo (fictitious character), fiction",
                "British and irish fiction (fictional works by one author)",
                "Gandalf (fictitious character), fiction",
                "Middle earth (imaginary place), fiction"
            ],
            "_version_": 1759785587667107840,
            "author_facet": [
                "OL10659931A J. R. R. Tolkien"
            ],
            "subject_key": [
                "baggins_bilbo_(fictitious_character)_fiction",
                "baggins_frodo_(fictitious_character)_fiction",
                "british_and_irish_fiction_(fictional_works_by_one_author)",
                "gandalf_(fictitious_character)_fiction",
                "middle_earth_(imaginary_place)_fiction"
            ]
        },
        {
            "key": "/works/OL13578274W",
            "type": "work",
            "seed": [
                "/books/OL22373882M",
                "/books/OL22373883M",
                "/works/OL13578274W",
                "/subjects/motion_picture_plays",
                "/subjects/drama",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/fantasy_films",
                "/subjects/time:2001-2010",
                "/authors/OL6439810A"
            ],
            "title": "The lord of the rings",
            "title_suggest": "The lord of the rings",
            "title_sort": "The lord of the rings",
            "edition_count": 2,
            "edition_key": [
                "OL22373882M",
                "OL22373883M"
            ],
            "publish_date": [
                "2002",
                "2003"
            ],
            "publish_year": [
                2002,
                2003
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 135,
            "publish_place": [
                "[2002?]"
            ],
            "contributor": [
                "Boyens, Philippa.",
                "Tolkien, J. R. R. 1892-1973.",
                "Jackson, Peter, 1961-"
            ],
            "last_modified_i": 1264743054,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 1,
            "want_to_read_count": 1,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "language": [
                "eng"
            ],
            "author_key": [
                "OL6439810A"
            ],
            "author_name": [
                "Fran Walsh"
            ],
            "subject": [
                "Motion picture plays",
                "Drama",
                "Middle Earth (Imaginary place)",
                "Fantasy films"
            ],
            "time": [
                "2001-2010"
            ],
            "time_facet": [
                "2001-2010"
            ],
            "subject_facet": [
                "Drama",
                "Fantasy films",
                "Middle Earth (Imaginary place)",
                "Motion picture plays"
            ],
            "_version_": 1759748823732715520,
            "author_facet": [
                "OL6439810A Fran Walsh"
            ],
            "subject_key": [
                "drama",
                "fantasy_films",
                "middle_earth_(imaginary_place)",
                "motion_picture_plays"
            ],
            "time_key": [
                "2001-2010"
            ]
        },
        {
            "key": "/works/OL5758765W",
            "type": "work",
            "seed": [
                "/books/OL3700865M",
                "/books/OL3328599M",
                "/works/OL5758765W",
                "/subjects/motion_pictures",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/lord_of_the_rings_the_two_towers_(motion_picture)",
                "/subjects/lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "/subjects/setting_and_scenery",
                "/subjects/characters_and_characteristics_in_motion_pictures",
                "/subjects/pictorial_works",
                "/subjects/motion_pictures_pictorial_works",
                "/subjects/fantasy_films_history_and_criticism",
                "/subjects/person:j._r._r._tolkein_(1892-1973)",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL1401384A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "subtitle": "The Art of The Two Towers",
            "edition_count": 2,
            "edition_key": [
                "OL3700865M",
                "OL3328599M"
            ],
            "publish_date": [
                "2003",
                "2004"
            ],
            "publish_year": [
                2003,
                2004
            ],
            "first_publish_year": 2003,
            "number_of_pages_median": 208,
            "lccn": [
                "2003266852",
                "2004303379"
            ],
            "publish_place": [
                "Boston, Mass"
            ],
            "oclc": [
                "51869993",
                "53997270"
            ],
            "lcc": [
                "PN-1997.20000000.L679 R87 2004",
                "PN-1997.20000000.L678 R87 2003",
                "PN-1997.20000000.L67R93 2003",
                "PN-1997.20000000.L679R87"
            ],
            "ddc": [
                "791.4372"
            ],
            "isbn": [
                "0618430296",
                "9780618331307",
                "9780618430291",
                "0618331301"
            ],
            "last_modified_i": 1676522311,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringsartof0000russ"
            ],
            "ia_collection": [
                "inlibrary",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "inlibrary;internetarchivebooks;printdisabled",
            "lending_edition_s": "OL3700865M",
            "lending_identifier_s": "lordofringsartof0000russ",
            "printdisabled_s": "OL3700865M",
            "ratings_count_1": 0,
            "ratings_count_2": 0,
            "ratings_count_3": 0,
            "ratings_count_4": 0,
            "ratings_count_5": 1,
            "ratings_average": 5.0,
            "ratings_sortable": 2.4036636,
            "ratings_count": 1,
            "readinglog_count": 1,
            "want_to_read_count": 0,
            "currently_reading_count": 0,
            "already_read_count": 1,
            "cover_edition_key": "OL3700865M",
            "cover_i": 394161,
            "publisher": [
                "Houghton Mifflin"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL1401384A"
            ],
            "author_name": [
                "Gary Russell"
            ],
            "person": [
                "J. R. R. Tolkein (1892-1973)",
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "Motion pictures",
                "Middle Earth (Imaginary place)",
                "Lord of the rings, the two towers (Motion picture)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Setting and scenery",
                "Characters and characteristics in motion pictures",
                "Pictorial works",
                "Motion pictures, pictorial works",
                "Fantasy films, history and criticism"
            ],
            "id_goodreads": [
                "15242",
                "67514"
            ],
            "id_librarything": [
                "186295",
                "186294"
            ],
            "ia_box_id": [
                "IA40860901"
            ],
            "publisher_facet": [
                "Houghton Mifflin"
            ],
            "person_key": [
                "j._r._r._tolkein_(1892-1973)",
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkein (1892-1973)",
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "Characters and characteristics in motion pictures",
                "Fantasy films, history and criticism",
                "Lord of the rings, the return of the king (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Middle Earth (Imaginary place)",
                "Motion pictures",
                "Motion pictures, pictorial works",
                "Pictorial works",
                "Setting and scenery"
            ],
            "_version_": 1759795522435022848,
            "lcc_sort": "PN-1997.20000000.L679 R87 2004",
            "author_facet": [
                "OL1401384A Gary Russell"
            ],
            "subject_key": [
                "characters_and_characteristics_in_motion_pictures",
                "fantasy_films_history_and_criticism",
                "lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "lord_of_the_rings_the_two_towers_(motion_picture)",
                "middle_earth_(imaginary_place)",
                "motion_pictures",
                "motion_pictures_pictorial_works",
                "pictorial_works",
                "setting_and_scenery"
            ],
            "ddc_sort": "791.4372"
        },
        {
            "key": "/works/OL3062780W",
            "type": "work",
            "seed": [
                "/books/OL25430694M",
                "/books/OL3700728M",
                "/works/OL3062780W",
                "/subjects/lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "/subjects/lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "/subjects/lord_of_the_rings_the_two_towers_(motion_picture)",
                "/subjects/motion_pictures_history",
                "/subjects/motion_pictures_production_and_direction",
                "/subjects/fantasy_films_history_and_criticism",
                "/subjects/cinematography",
                "/subjects/special_effects",
                "/authors/OL475982A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 2,
            "edition_key": [
                "OL25430694M",
                "OL3700728M"
            ],
            "publish_date": [
                "2002"
            ],
            "publish_year": [
                2002
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 191,
            "lccn": [
                "2003266645"
            ],
            "publish_place": [
                "Boston",
                "Amsterdam, Netherlands"
            ],
            "oclc": [
                "51196462",
                "50917316"
            ],
            "lcc": [
                "PN-1995.90000000.L58 S53 2002",
                "PN-1997.20000000.L67S38 2002"
            ],
            "ddc": [
                "791.4372"
            ],
            "isbn": [
                "9789022533956",
                "0618260226",
                "0618258000",
                "9022533956",
                "9780618260225",
                "9780618258000"
            ],
            "last_modified_i": 1671586510,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL3700728M",
            "cover_i": 393992,
            "publisher": [
                "Uitgeverij M",
                "Houghton Mifflin Company"
            ],
            "language": [
                "dut",
                "eng"
            ],
            "author_key": [
                "OL475982A"
            ],
            "author_name": [
                "Brian Sibley"
            ],
            "author_alternative_name": [
                "Brian David Sibley"
            ],
            "subject": [
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Motion pictures, history",
                "Motion pictures, production and direction",
                "Fantasy films, history and criticism",
                "Cinematography",
                "Special effects"
            ],
            "id_goodreads": [
                "780852",
                "7351"
            ],
            "id_librarything": [
                "76320"
            ],
            "publisher_facet": [
                "Houghton Mifflin Company",
                "Uitgeverij M"
            ],
            "subject_facet": [
                "Cinematography",
                "Fantasy films, history and criticism",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Motion pictures, history",
                "Motion pictures, production and direction",
                "Special effects"
            ],
            "_version_": 1759782541307412480,
            "lcc_sort": "PN-1995.90000000.L58 S53 2002",
            "author_facet": [
                "OL475982A Brian Sibley"
            ],
            "subject_key": [
                "cinematography",
                "fantasy_films_history_and_criticism",
                "lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "lord_of_the_rings_the_two_towers_(motion_picture)",
                "motion_pictures_history",
                "motion_pictures_production_and_direction",
                "special_effects"
            ],
            "ddc_sort": "791.4372"
        },
        {
            "key": "/works/OL4005122W",
            "type": "work",
            "seed": [
                "/books/OL21090294M",
                "/books/OL1471527M",
                "/works/OL4005122W",
                "/subjects/corrupt_practices",
                "/subjects/finance",
                "/subjects/international_olympic_committee",
                "/subjects/mass_media_and_sports",
                "/subjects/olympics",
                "/subjects/political_aspects",
                "/subjects/political_aspects_of_olympics",
                "/subjects/sports",
                "/authors/OL738083A"
            ],
            "title": "The lords of the rings",
            "title_suggest": "The lords of the rings",
            "title_sort": "The lords of the rings",
            "edition_count": 2,
            "edition_key": [
                "OL21090294M",
                "OL1471527M"
            ],
            "publish_date": [
                "1992"
            ],
            "publish_year": [
                1992
            ],
            "first_publish_year": 1992,
            "number_of_pages_median": 290,
            "lccn": [
                "93134306"
            ],
            "publish_place": [
                "London",
                "Toronto, Canada"
            ],
            "contributor": [
                "Jennings, Andrew."
            ],
            "lcc": [
                "GV-0721.50000000.S56 1992",
                "GV-0721.60000000.S57 1992"
            ],
            "ddc": [
                "796.48"
            ],
            "isbn": [
                "9780671711221",
                "0773726365",
                "0671711229",
                "9780773726369"
            ],
            "last_modified_i": 1670449507,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordsofringspowe0000sims"
            ],
            "ia_collection": [
                "inlibrary",
                "internetarchivebooks",
                "printdisabled",
                "unb-ol"
            ],
            "ia_collection_s": "inlibrary;internetarchivebooks;printdisabled;unb-ol",
            "lending_edition_s": "OL1471527M",
            "lending_identifier_s": "lordsofringspowe0000sims",
            "printdisabled_s": "OL1471527M",
            "cover_edition_key": "OL1471527M",
            "cover_i": 12594754,
            "publisher": [
                "Stoddart",
                "Simon & Schuster"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL738083A"
            ],
            "author_name": [
                "Vyv Simson"
            ],
            "subject": [
                "Corrupt practices",
                "Finance",
                "International Olympic Committee",
                "Mass media and sports",
                "Olympics",
                "Political aspects",
                "Political aspects of Olympics",
                "Sports"
            ],
            "id_goodreads": [
                "1090327",
                "15362"
            ],
            "id_librarything": [
                "6036356",
                "9826010"
            ],
            "ia_box_id": [
                "IA40330706"
            ],
            "publisher_facet": [
                "Simon & Schuster",
                "Stoddart"
            ],
            "subject_facet": [
                "Corrupt practices",
                "Finance",
                "International Olympic Committee",
                "Mass media and sports",
                "Olympics",
                "Political aspects",
                "Political aspects of Olympics",
                "Sports"
            ],
            "_version_": 1759791684027154434,
            "lcc_sort": "GV-0721.50000000.S56 1992",
            "author_facet": [
                "OL738083A Vyv Simson"
            ],
            "subject_key": [
                "corrupt_practices",
                "finance",
                "international_olympic_committee",
                "mass_media_and_sports",
                "olympics",
                "political_aspects",
                "political_aspects_of_olympics",
                "sports"
            ],
            "ddc_sort": "796.48"
        },
        {
            "key": "/works/OL6057400W",
            "type": "work",
            "seed": [
                "/books/OL22815701M",
                "/books/OL26645000M",
                "/works/OL6057400W",
                "/subjects/motion_picture_locations",
                "/subjects/lord_of_the_rings_return_of_the_king_(motion_picture)",
                "/subjects/lord_of_the_rings_the_two_towers_(motion_picture)",
                "/subjects/lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "/subjects/description_and_travel",
                "/subjects/travel",
                "/subjects/lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "/subjects/place:new_zealand",
                "/authors/OL1529345A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "subtitle": "location guidebook",
            "edition_count": 2,
            "edition_key": [
                "OL22815701M",
                "OL26645000M"
            ],
            "publish_date": [
                "2004",
                "2003"
            ],
            "publish_year": [
                2004,
                2003
            ],
            "first_publish_year": 2003,
            "number_of_pages_median": 152,
            "publish_place": [
                "Auckland, NZ",
                "London"
            ],
            "oclc": [
                "57659434"
            ],
            "lcc": [
                "PN-1995.67000000.N47 B76 2004"
            ],
            "ddc": [
                "919.3044",
                "791.43720993"
            ],
            "isbn": [
                "9781869505301",
                "9780007179251",
                "1869505301",
                "0007179251"
            ],
            "last_modified_i": 1621260200,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "isbn_9781869505301"
            ],
            "ia_collection": [
                "binghamton-ol",
                "china",
                "inlibrary",
                "internetarchivebooks",
                "openlibrary-d-ol",
                "printdisabled"
            ],
            "ia_collection_s": "binghamton-ol;china;inlibrary;internetarchivebooks;openlibrary-d-ol;printdisabled",
            "lending_edition_s": "OL26645000M",
            "lending_identifier_s": "isbn_9781869505301",
            "printdisabled_s": "OL26645000M",
            "readinglog_count": 1,
            "want_to_read_count": 0,
            "currently_reading_count": 0,
            "already_read_count": 1,
            "cover_edition_key": "OL26645000M",
            "cover_i": 8332180,
            "publisher": [
                "HarperCollins"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL1529345A"
            ],
            "author_name": [
                "Ian Brodie"
            ],
            "place": [
                "New Zealand"
            ],
            "subject": [
                "Motion picture locations",
                "Lord of the rings, return of the king (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Description and travel",
                "Travel",
                "Lord of the rings, the return of the king (Motion picture)"
            ],
            "id_goodreads": [
                "892561"
            ],
            "id_librarything": [
                "241932"
            ],
            "ia_box_id": [
                "IA176701"
            ],
            "publisher_facet": [
                "HarperCollins"
            ],
            "place_key": [
                "new_zealand"
            ],
            "subject_facet": [
                "Description and travel",
                "Lord of the rings, return of the king (Motion picture)",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Motion picture locations",
                "Travel"
            ],
            "_version_": 1759796402481790979,
            "place_facet": [
                "New Zealand"
            ],
            "lcc_sort": "PN-1995.67000000.N47 B76 2004",
            "author_facet": [
                "OL1529345A Ian Brodie"
            ],
            "subject_key": [
                "description_and_travel",
                "lord_of_the_rings_return_of_the_king_(motion_picture)",
                "lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "lord_of_the_rings_the_two_towers_(motion_picture)",
                "motion_picture_locations",
                "travel"
            ],
            "ddc_sort": "791.43720993"
        },
        {
            "key": "/works/OL33106210W",
            "type": "work",
            "seed": [
                "/books/OL47056276M",
                "/books/OL44976834M",
                "/works/OL33106210W",
                "/authors/OL10142807A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 2,
            "edition_key": [
                "OL47056276M",
                "OL44976834M"
            ],
            "publish_date": [
                "Dec 27, 2002",
                "1980-01-01"
            ],
            "publish_year": [
                2002,
                1980
            ],
            "first_publish_year": 1980,
            "number_of_pages_median": 448,
            "isbn": [
                "9780007136629",
                "0007136625"
            ],
            "last_modified_i": 1677581146,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 0,
            "want_to_read_count": 0,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL44976834M",
            "cover_i": 13118192,
            "publisher": [
                "Book Club Associates",
                "Harpercollins"
            ],
            "author_key": [
                "OL10142807A"
            ],
            "author_name": [
                "J R R Tolkien"
            ],
            "id_amazon": [
                "B000XPGG50"
            ],
            "id_better_world_books": [
                "BWB37283078"
            ],
            "publisher_facet": [
                "Book Club Associates",
                "Harpercollins"
            ],
            "_version_": 1759871377180983296,
            "author_facet": [
                "OL10142807A J R R Tolkien"
            ]
        },
        {
            "key": "/works/OL27739988W",
            "type": "work",
            "seed": [
                "/books/OL37871183M",
                "/books/OL38062258M",
                "/works/OL27739988W",
                "/authors/OL26320A",
                "/authors/OL9950269A",
                "/authors/OL10355883A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 2,
            "edition_key": [
                "OL37871183M",
                "OL38062258M"
            ],
            "publish_date": [
                "May 14, 1992",
                "2022"
            ],
            "publish_year": [
                1992,
                2022
            ],
            "first_publish_year": 1992,
            "number_of_pages_median": 1248,
            "isbn": [
                "0063274736",
                "4566023540",
                "9784566023543",
                "9780063274730"
            ],
            "last_modified_i": 1680475088,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 0,
            "want_to_read_count": 0,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL38062258M",
            "cover_i": 13806118,
            "publisher": [
                "Hyoronsha",
                "HarperCollins Publishers",
                "William Morrow"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL26320A",
                "OL9950269A",
                "OL10355883A"
            ],
            "author_name": [
                "J.R.R. Tolkien",
                "John Ronald Reuel Tolkien",
                "Tanaka Tomoko"
            ],
            "author_alternative_name": [
                "John Ronald Reuel Tolkien",
                "J. R. R. Tolkein",
                "J.R.R. Tolkein",
                "J. R. R. Tolkien",
                "Dzhon R. R. Tolkin",
                "Yue Han Luo Na De Rui Er Tuo Er Jin"
            ],
            "publisher_facet": [
                "HarperCollins Publishers",
                "Hyoronsha",
                "William Morrow"
            ],
            "_version_": 1762105850270318599,
            "author_facet": [
                "OL10355883A Tanaka Tomoko",
                "OL26320A J.R.R. Tolkien",
                "OL9950269A John Ronald Reuel Tolkien"
            ]
        },
        {
            "key": "/works/OL5758761W",
            "type": "work",
            "seed": [
                "/books/OL7263676M",
                "/books/OL9218391M",
                "/works/OL5758761W",
                "/authors/OL1401384A"
            ],
            "title": "The Art of the \"Lord of the Rings\" Trilogy (\"Lord of the Rings\")",
            "title_suggest": "The Art of the \"Lord of the Rings\" Trilogy (\"Lord of the Rings\")",
            "title_sort": "The Art of the \"Lord of the Rings\" Trilogy (\"Lord of the Rings\")",
            "edition_count": 2,
            "edition_key": [
                "OL7263676M",
                "OL9218391M"
            ],
            "publish_date": [
                "November 1, 2004"
            ],
            "publish_year": [
                2004
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 192,
            "isbn": [
                "0007191928",
                "9780007191925"
            ],
            "last_modified_i": 1354101075,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL9218391M",
            "cover_i": 12822,
            "publisher": [
                "HarperCollins Publishers Ltd"
            ],
            "author_key": [
                "OL1401384A"
            ],
            "author_name": [
                "Gary Russell"
            ],
            "id_goodreads": [
                "15300"
            ],
            "id_librarything": [
                "244839"
            ],
            "publisher_facet": [
                "HarperCollins Publishers Ltd"
            ],
            "_version_": 1759795522630057985,
            "author_facet": [
                "OL1401384A Gary Russell"
            ]
        },
        {
            "key": "/works/OL5758762W",
            "type": "work",
            "seed": [
                "/books/OL22582618M",
                "/books/OL9216708M",
                "/books/OL7261993M",
                "/books/OL22022502M",
                "/works/OL5758762W",
                "/authors/OL1401384A"
            ],
            "title": "The Art of the \"Return of the King\" (\"Lord of the Rings\")",
            "title_suggest": "The Art of the \"Return of the King\" (\"Lord of the Rings\")",
            "title_sort": "The Art of the \"Return of the King\" (\"Lord of the Rings\")",
            "edition_count": 4,
            "edition_key": [
                "OL22582618M",
                "OL9216708M",
                "OL7261993M",
                "OL22022502M"
            ],
            "publish_date": [
                "January 5, 2004",
                "2004"
            ],
            "publish_year": [
                2004
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 192,
            "publish_place": [
                "London",
                "LONDON"
            ],
            "contributor": [
                "Russell, Gary."
            ],
            "ddc": [
                "791.4372"
            ],
            "isbn": [
                "9780007135653",
                "0007135653"
            ],
            "last_modified_i": 1588756162,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL9216708M",
            "cover_i": 9957,
            "publisher": [
                "HARPERCOLLINS",
                "HarperCollins",
                "HarperCollins Publishers Ltd"
            ],
            "language": [
                "und",
                "eng"
            ],
            "author_key": [
                "OL1401384A"
            ],
            "author_name": [
                "Gary Russell"
            ],
            "id_goodreads": [
                "15250"
            ],
            "id_librarything": [
                "186294"
            ],
            "publisher_facet": [
                "HARPERCOLLINS",
                "HarperCollins",
                "HarperCollins Publishers Ltd"
            ],
            "_version_": 1759795523107160065,
            "author_facet": [
                "OL1401384A Gary Russell"
            ],
            "ddc_sort": "791.4372"
        },
        {
            "key": "/works/OL27453W",
            "type": "work",
            "seed": [
                "/books/OL9429879M",
                "/books/OL37785372M",
                "/books/OL19581879M",
                "/works/OL27453W",
                "/subjects/poetry_(poetic_works_by_one_author)",
                "/authors/OL26320A"
            ],
            "title": "Poems from The lord of the rings",
            "title_suggest": "Poems from The lord of the rings",
            "title_sort": "Poems from The lord of the rings",
            "edition_count": 3,
            "edition_key": [
                "OL9429879M",
                "OL37785372M",
                "OL19581879M"
            ],
            "publish_date": [
                "2002",
                "2001",
                "October 20, 1994"
            ],
            "publish_year": [
                2002,
                2001,
                1994
            ],
            "first_publish_year": 1994,
            "number_of_pages_median": 96,
            "publish_place": [
                "Prague, Czech Republic",
                "London"
            ],
            "contributor": [
                "Lee, Alan, 1947-",
                "Alan Lee (Illustrator)",
                "Tolkien, J. R. R. 1892-1973."
            ],
            "lcc": [
                "PR-6039.00000000.O32"
            ],
            "ddc": [
                "821.912"
            ],
            "isbn": [
                "9780261103122",
                "8020408894",
                "9788020408891",
                "0261103121"
            ],
            "last_modified_i": 1648483171,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 1,
            "want_to_read_count": 1,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL9429879M",
            "cover_i": 149269,
            "publisher": [
                "HarperCollins Publishers Ltd",
                "Mlad\u00e1 fronta",
                "HarperCollins"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL26320A"
            ],
            "author_name": [
                "J.R.R. Tolkien"
            ],
            "author_alternative_name": [
                "Dzhon R. R. Tolkin",
                "J.R.R. Tolkein",
                "Yue Han Luo Na De Rui Er Tuo Er Jin",
                "J. R. R. Tolkein",
                "J. R. R. Tolkien",
                "John Ronald Reuel Tolkien"
            ],
            "subject": [
                "Poetry (poetic works by one author)"
            ],
            "id_goodreads": [
                "15315"
            ],
            "id_librarything": [
                "364210"
            ],
            "publisher_facet": [
                "HarperCollins",
                "HarperCollins Publishers Ltd",
                "Mlad\u00e1 fronta"
            ],
            "subject_facet": [
                "Poetry (poetic works by one author)"
            ],
            "_version_": 1759776047508750336,
            "lcc_sort": "PR-6039.00000000.O32",
            "author_facet": [
                "OL26320A J.R.R. Tolkien"
            ],
            "subject_key": [
                "poetry_(poetic_works_by_one_author)"
            ],
            "ddc_sort": "821.912"
        },
        {
            "key": "/works/OL56270W",
            "type": "work",
            "seed": [
                "/books/OL19304118M",
                "/books/OL3972109M",
                "/books/OL10859400M",
                "/works/OL56270W",
                "/subjects/english_fantasy_fiction",
                "/subjects/history_and_criticism",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/subjects/fantasy_fiction_history_and_criticism",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL31242A"
            ],
            "title": "Tolkien and the Lord of the rings",
            "title_suggest": "Tolkien and the Lord of the rings",
            "title_sort": "Tolkien and the Lord of the rings",
            "edition_count": 3,
            "edition_key": [
                "OL19304118M",
                "OL3972109M",
                "OL10859400M"
            ],
            "publish_date": [
                "2001",
                "April 2004"
            ],
            "publish_year": [
                2001,
                2004
            ],
            "first_publish_year": 2001,
            "number_of_pages_median": 296,
            "lccn": [
                "2001281095"
            ],
            "publish_place": [
                "London",
                "Mahwah, N.J"
            ],
            "oclc": [
                "149222842",
                "48555887"
            ],
            "lcc": [
                "PR-6039.00000000.O32 L63338 2001"
            ],
            "ddc": [
                "823.912"
            ],
            "isbn": [
                "9781587680175",
                "9781902694221",
                "9780756778880",
                "1587680173",
                "1902694228",
                "0756778883"
            ],
            "last_modified_i": 1631741729,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "tolkienlordofrin00duri"
            ],
            "ia_collection": [
                "china",
                "inlibrary",
                "internetarchivebooks",
                "printdisabled",
                "rochester-ol",
                "universityofoklahoma-ol"
            ],
            "ia_collection_s": "china;inlibrary;internetarchivebooks;printdisabled;rochester-ol;universityofoklahoma-ol",
            "lending_edition_s": "OL3972109M",
            "lending_identifier_s": "tolkienlordofrin00duri",
            "printdisabled_s": "OL3972109M",
            "readinglog_count": 3,
            "want_to_read_count": 2,
            "currently_reading_count": 0,
            "already_read_count": 1,
            "cover_edition_key": "OL3972109M",
            "cover_i": 855378,
            "first_sentence": [
                "J.R.R. Tolkien's most familiar creation, the hobbits of Middle-earth, belonged only to his private world until September 1937."
            ],
            "publisher": [
                "HiddenSpring",
                "Diane Pub Co",
                "Azure"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL31242A"
            ],
            "author_name": [
                "Colin Duriez"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "English Fantasy fiction",
                "History and criticism",
                "Middle Earth (Imaginary place)",
                "Middle earth (imaginary place)",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Fantasy fiction, history and criticism"
            ],
            "id_goodreads": [
                "1796978",
                "1442207",
                "92037"
            ],
            "id_librarything": [
                "314630"
            ],
            "ia_box_id": [
                "IA1146920"
            ],
            "publisher_facet": [
                "Azure",
                "Diane Pub Co",
                "HiddenSpring"
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "English Fantasy fiction",
                "Fantasy fiction, history and criticism",
                "History and criticism",
                "Middle Earth (Imaginary place)",
                "Middle earth (imaginary place)",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "_version_": 1759795392650674177,
            "lcc_sort": "PR-6039.00000000.O32 L63338 2001",
            "author_facet": [
                "OL31242A Colin Duriez"
            ],
            "subject_key": [
                "english_fantasy_fiction",
                "fantasy_fiction_history_and_criticism",
                "history_and_criticism",
                "middle_earth_(imaginary_place)",
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973"
            ],
            "ddc_sort": "823.912"
        },
        {
            "key": "/works/OL646325W",
            "type": "work",
            "seed": [
                "/books/OL74386M",
                "/books/OL12268325M",
                "/works/OL646325W",
                "/subjects/motion_pictures",
                "/subjects/psychological_aspects",
                "/subjects/psychological_aspects_of_motion_pictures",
                "/authors/OL50039A"
            ],
            "title": "Realm of the Ring Lord",
            "title_suggest": "Realm of the Ring Lord",
            "title_sort": "Realm of the Ring Lord",
            "edition_count": 2,
            "edition_key": [
                "OL74386M",
                "OL12268325M"
            ],
            "publish_date": [
                "October 2001",
                "1998"
            ],
            "publish_year": [
                1998,
                2001
            ],
            "first_publish_year": 1998,
            "number_of_pages_median": 144,
            "lccn": [
                "99175960"
            ],
            "publish_place": [
                "Roma"
            ],
            "oclc": [
                "40482380"
            ],
            "lcc": [
                "PN-1995.00000000.E67 1998"
            ],
            "ddc": [
                "791.43019"
            ],
            "isbn": [
                "1903773075",
                "9781903773079"
            ],
            "last_modified_i": 1606872668,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL12268325M",
            "cover_i": 3045951,
            "publisher": [
                "MediaQuest",
                "Minotauro"
            ],
            "language": [
                "ita"
            ],
            "author_key": [
                "OL50039A"
            ],
            "author_name": [
                "Laurence Gardner"
            ],
            "subject": [
                "Motion pictures",
                "Psychological aspects",
                "Psychological aspects of Motion pictures"
            ],
            "id_goodreads": [
                "489110"
            ],
            "publisher_facet": [
                "MediaQuest",
                "Minotauro"
            ],
            "subject_facet": [
                "Motion pictures",
                "Psychological aspects",
                "Psychological aspects of Motion pictures"
            ],
            "_version_": 1759797260913213441,
            "lcc_sort": "PN-1995.00000000.E67 1998",
            "author_facet": [
                "OL50039A Laurence Gardner"
            ],
            "subject_key": [
                "motion_pictures",
                "psychological_aspects",
                "psychological_aspects_of_motion_pictures"
            ],
            "ddc_sort": "791.43019"
        },
        {
            "key": "/works/OL5754682W",
            "type": "work",
            "seed": [
                "/books/OL7263052M",
                "/books/OL9217767M",
                "/works/OL5754682W",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/subjects/motion_pictures",
                "/authors/OL1400080A"
            ],
            "title": "Gollum (\"Lord of the Rings\")",
            "title_suggest": "Gollum (\"Lord of the Rings\")",
            "title_sort": "Gollum (\"Lord of the Rings\")",
            "edition_count": 2,
            "edition_key": [
                "OL7263052M",
                "OL9217767M"
            ],
            "publish_date": [
                "December 1, 2003"
            ],
            "publish_year": [
                2003
            ],
            "first_publish_year": 2003,
            "number_of_pages_median": 112,
            "isbn": [
                "9780007170579",
                "0007170572"
            ],
            "last_modified_i": 1671248003,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL9217767M",
            "cover_i": 11903,
            "publisher": [
                "Collins"
            ],
            "author_key": [
                "OL1400080A"
            ],
            "author_name": [
                "Andy Serkis"
            ],
            "subject": [
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Motion pictures"
            ],
            "id_amazon": [
                ""
            ],
            "id_goodreads": [
                "477217"
            ],
            "id_librarything": [
                "5792"
            ],
            "publisher_facet": [
                "Collins"
            ],
            "subject_facet": [
                "Motion pictures",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "_version_": 1759795622878117888,
            "author_facet": [
                "OL1400080A Andy Serkis"
            ],
            "subject_key": [
                "motion_pictures",
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973"
            ]
        },
        {
            "key": "/works/OL264045W",
            "type": "work",
            "seed": [
                "/books/OL12284820M",
                "/books/OL12284819M",
                "/works/OL264045W",
                "/authors/OL2623771A"
            ],
            "title": "The Lord Of The Rings TCG",
            "title_suggest": "The Lord Of The Rings TCG",
            "title_sort": "The Lord Of The Rings TCG",
            "edition_count": 2,
            "edition_key": [
                "OL12284820M",
                "OL12284819M"
            ],
            "publish_date": [
                "August 12, 2005",
                "October 1, 2004"
            ],
            "publish_year": [
                2005,
                2004
            ],
            "first_publish_year": 2004,
            "isbn": [
                "1582366268",
                "9781582366265",
                "158236625X",
                "9781582366258"
            ],
            "last_modified_i": 1272442724,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL12284819M",
            "cover_i": 2936468,
            "publisher": [
                "Decipher"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL2623771A"
            ],
            "author_name": [
                "Various"
            ],
            "author_alternative_name": [
                "VARIOS.",
                "varios",
                "Various Non-Fiction Authors",
                "Various Authors",
                "varios autores",
                "Autores varios",
                "Various, Authors",
                "Vario",
                "Varios Participantes",
                "Various Au",
                "Varios Artistas",
                "VARIOS(832172)",
                "Author Autores Varios",
                "Various Authors By",
                "Autores VARIOS",
                "Various Authors & Artists",
                "various authors",
                "Varios Autores",
                "Various Writers",
                "VARIOS(132735)",
                "Compendium of various authors",
                "Various.",
                "Compendium of Various Authors",
                "VARIOUS AUTHOR",
                "VARIOS",
                "VARIOS AUTORES",
                "Anthology: various authors",
                "Various Aut",
                "various.",
                "Various Celebrated Authors",
                "VARIOUS",
                "VARIOUS AUTHORS",
                "by Various Authors",
                "Various authors",
                "Various Aut.",
                "Various AUTORES",
                "Various authors.",
                "Varios",
                "Varios autores",
                "autores varios",
                "Various Chapter Authors",
                "Autores Varios",
                "Various Various",
                "A Compendium of Various Authors",
                "Readers to Be Confirmed Various Authors",
                "Authors Various Authors",
                "VARIOUS SPMG",
                "Various Authorities",
                "Various - DO NOT USE",
                "varios authors",
                "Various Illustrators Various Authors",
                "various",
                "(various)"
            ],
            "id_goodreads": [
                "3029327",
                "1081806"
            ],
            "publisher_facet": [
                "Decipher"
            ],
            "_version_": 1759773885273735169,
            "author_facet": [
                "OL2623771A Various"
            ]
        },
        {
            "key": "/works/OL21068326W",
            "type": "work",
            "seed": [
                "/books/OL28521002M",
                "/books/OL30076116M",
                "/works/OL21068326W",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/subjects/middle_earth_(imaginary_place)",
                "/authors/OL3089578A"
            ],
            "title": "Studying the Lord of the Rings",
            "title_suggest": "Studying the Lord of the Rings",
            "title_sort": "Studying the Lord of the Rings",
            "edition_count": 2,
            "edition_key": [
                "OL28521002M",
                "OL30076116M"
            ],
            "publish_date": [
                "2020",
                "2014"
            ],
            "publish_year": [
                2020,
                2014
            ],
            "first_publish_year": 2014,
            "number_of_pages_median": 120,
            "isbn": [
                "1800348533",
                "9781800348530",
                "1906733821",
                "9781906733827"
            ],
            "last_modified_i": 1599101994,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Auteur Publishing"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL3089578A"
            ],
            "author_name": [
                "Anna Dawson"
            ],
            "subject": [
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973",
                "Middle earth (imaginary place)"
            ],
            "publisher_facet": [
                "Auteur Publishing"
            ],
            "subject_facet": [
                "Middle earth (imaginary place)",
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "_version_": 1759763592394047488,
            "author_facet": [
                "OL3089578A Anna Dawson"
            ],
            "subject_key": [
                "middle_earth_(imaginary_place)",
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973"
            ]
        },
        {
            "key": "/works/OL5954913W",
            "type": "work",
            "seed": [
                "/books/OL8845457M",
                "/books/OL3556154M",
                "/works/OL5954913W",
                "/subjects/english_fantasy_fiction",
                "/subjects/history_and_criticism",
                "/subjects/middle_earth_(imaginary_place)",
                "/subjects/english_literature",
                "/subjects/juvenile_literature",
                "/subjects/lord_of_the_rings_(tolkien_j.r.r.)",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL1477038A",
                "/authors/OL3115588A"
            ],
            "title": "Understanding The lord of the rings",
            "title_suggest": "Understanding The lord of the rings",
            "title_sort": "Understanding The lord of the rings",
            "edition_count": 2,
            "edition_key": [
                "OL8845457M",
                "OL3556154M"
            ],
            "publish_date": [
                "April 23, 2003",
                "2003"
            ],
            "publish_year": [
                2003
            ],
            "first_publish_year": 2003,
            "number_of_pages_median": 96,
            "lccn": [
                "2002013087"
            ],
            "publish_place": [
                "San Diego"
            ],
            "lcc": [
                "PR-6039.00000000.O32 L6363 2003"
            ],
            "ddc": [
                "823.912"
            ],
            "isbn": [
                "9781590182345",
                "1590182340"
            ],
            "last_modified_i": 1677594148,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "understandinglor0000hodg"
            ],
            "ia_collection": [
                "china",
                "inlibrary",
                "internetarchivebooks",
                "openlibrary-d-ol",
                "printdisabled"
            ],
            "ia_collection_s": "china;inlibrary;internetarchivebooks;openlibrary-d-ol;printdisabled",
            "lending_edition_s": "OL3556154M",
            "lending_identifier_s": "understandinglor0000hodg",
            "printdisabled_s": "OL3556154M",
            "readinglog_count": 1,
            "want_to_read_count": 1,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL8845457M",
            "cover_i": 1968698,
            "publisher": [
                "Lucent Books"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL1477038A",
                "OL3115588A"
            ],
            "author_name": [
                "Ted Hodges",
                "Donato Giancola"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "English Fantasy fiction",
                "History and criticism",
                "Middle Earth (Imaginary place)",
                "English literature",
                "Juvenile literature",
                "Lord of the rings (Tolkien, J.R.R.)"
            ],
            "id_goodreads": [
                "899769"
            ],
            "id_librarything": [
                "6757639"
            ],
            "ia_box_id": [
                "IA1260623"
            ],
            "publisher_facet": [
                "Lucent Books"
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "English Fantasy fiction",
                "English literature",
                "History and criticism",
                "Juvenile literature",
                "Lord of the rings (Tolkien, J.R.R.)",
                "Middle Earth (Imaginary place)"
            ],
            "_version_": 1759879424053870593,
            "lcc_sort": "PR-6039.00000000.O32 L6363 2003",
            "author_facet": [
                "OL1477038A Ted Hodges",
                "OL3115588A Donato Giancola"
            ],
            "subject_key": [
                "english_fantasy_fiction",
                "english_literature",
                "history_and_criticism",
                "juvenile_literature",
                "lord_of_the_rings_(tolkien_j.r.r.)",
                "middle_earth_(imaginary_place)"
            ],
            "ddc_sort": "823.912"
        },
        {
            "key": "/works/OL9262013W",
            "type": "work",
            "seed": [
                "/books/OL9729713M",
                "/works/OL9262013W",
                "/authors/OL3317161A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL9729713M"
            ],
            "publish_date": [
                "March 1, 2006"
            ],
            "publish_year": [
                2006
            ],
            "first_publish_year": 2006,
            "number_of_pages_median": 44,
            "contributor": [
                "Cris DiMarco (Editor)"
            ],
            "isbn": [
                "1590921372",
                "9781590921371"
            ],
            "last_modified_i": 1272448863,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL9729713M",
            "cover_i": 1972472,
            "first_sentence": [
                "Read an assortment of alternative versions of Lord of the Rings (LOTR) written by George Lucas, Rudyard Kipling, and Meatloaf."
            ],
            "publisher": [
                "Lightning Rod, a Division of Windstorm Creative"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL3317161A"
            ],
            "author_name": [
                "Betsy Gallup"
            ],
            "id_goodreads": [
                "15302"
            ],
            "publisher_facet": [
                "Lightning Rod, a Division of Windstorm Creative"
            ],
            "_version_": 1759803161166479360,
            "author_facet": [
                "OL3317161A Betsy Gallup"
            ]
        },
        {
            "key": "/works/OL9838681W",
            "type": "work",
            "seed": [
                "/books/OL12120485M",
                "/works/OL9838681W",
                "/authors/OL3822898A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL12120485M"
            ],
            "publish_date": [
                "February 28, 2004"
            ],
            "publish_year": [
                2004
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 96,
            "oclc": [
                "40279463"
            ],
            "isbn": [
                "9781560771371",
                "1560771372"
            ],
            "last_modified_i": 1339477394,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Center for Learning"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL3822898A"
            ],
            "author_name": [
                "Carla Fritsch"
            ],
            "id_goodreads": [
                "275085"
            ],
            "publisher_facet": [
                "Center for Learning"
            ],
            "_version_": 1759804385055997953,
            "author_facet": [
                "OL3822898A Carla Fritsch"
            ]
        },
        {
            "key": "/works/OL22375412M",
            "type": "work",
            "seed": [
                "/books/OL22375412M",
                "/works/OL22375412M",
                "/subjects/motion_picture_plays.",
                "/subjects/middle_earth_(imaginary_place)_--_drama."
            ],
            "title": "lord of the rings.",
            "title_suggest": "lord of the rings.",
            "title_sort": "lord of the rings.",
            "edition_count": 1,
            "edition_key": [
                "OL22375412M"
            ],
            "number_of_pages_median": 221,
            "contributor": [
                "Sinclair, Stephen.",
                "Walsh, Fran, 1959-",
                "Jackson, Peter, 1961-",
                "Boyens, Philippa.",
                "Tolkien, J. R. R. 1892-1973."
            ],
            "last_modified_i": 1678281996,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "language": [
                "eng"
            ],
            "subject": [
                "Motion picture plays.",
                "Middle Earth (Imaginary place) -- Drama."
            ],
            "subject_facet": [
                "Middle Earth (Imaginary place) -- Drama.",
                "Motion picture plays."
            ],
            "_version_": 1759806224025518081,
            "subject_key": [
                "middle_earth_(imaginary_place)_--_drama.",
                "motion_picture_plays."
            ]
        },
        {
            "key": "/works/OL15476075M",
            "type": "work",
            "seed": [
                "/books/OL15476075M",
                "/works/OL15476075M",
                "/subjects/wrestling."
            ],
            "title": "lords of the ring.",
            "title_suggest": "lords of the ring.",
            "title_sort": "lords of the ring.",
            "edition_count": 1,
            "edition_key": [
                "OL15476075M"
            ],
            "number_of_pages_median": 90,
            "publish_place": [
                "London"
            ],
            "last_modified_i": 1678281293,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Gemini Vision"
            ],
            "language": [
                "eng"
            ],
            "subject": [
                "Wrestling."
            ],
            "publisher_facet": [
                "Gemini Vision"
            ],
            "subject_facet": [
                "Wrestling."
            ],
            "_version_": 1759805486238007296,
            "subject_key": [
                "wrestling."
            ]
        },
        {
            "key": "/works/OL13508175W",
            "type": "work",
            "seed": [
                "/books/OL21964564M",
                "/works/OL13508175W",
                "/authors/OL6376891A"
            ],
            "title": "Lord of the rings",
            "title_suggest": "Lord of the rings",
            "title_sort": "Lord of the rings",
            "edition_count": 1,
            "edition_key": [
                "OL21964564M"
            ],
            "last_modified_i": 1260862632,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "CHARISMA [CAS1059."
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL6376891A"
            ],
            "author_name": [
                "Bo Hansson"
            ],
            "publisher_facet": [
                "CHARISMA [CAS1059."
            ],
            "_version_": 1759748754697617409,
            "author_facet": [
                "OL6376891A Bo Hansson"
            ]
        },
        {
            "key": "/works/OL13754671W",
            "type": "work",
            "seed": [
                "/books/OL23126486M",
                "/works/OL13754671W",
                "/authors/OL6595630A"
            ],
            "title": "Lord of the rings",
            "title_suggest": "Lord of the rings",
            "title_sort": "Lord of the rings",
            "edition_count": 1,
            "edition_key": [
                "OL23126486M"
            ],
            "last_modified_i": 1260865359,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "author_key": [
                "OL6595630A"
            ],
            "author_name": [
                "jude Fisher"
            ],
            "_version_": 1759749015872733185,
            "author_facet": [
                "OL6595630A jude Fisher"
            ]
        },
        {
            "key": "/works/OL12413029W",
            "type": "work",
            "seed": [
                "/books/OL22643577M",
                "/works/OL12413029W",
                "/authors/OL5470710A"
            ],
            "title": "Lord of the rings",
            "title_suggest": "Lord of the rings",
            "title_sort": "Lord of the rings",
            "edition_count": 1,
            "edition_key": [
                "OL22643577M"
            ],
            "last_modified_i": 1260863666,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "language": [
                "eng"
            ],
            "author_key": [
                "OL5470710A"
            ],
            "author_name": [
                "Jim Pendrill"
            ],
            "_version_": 1759745975539204097,
            "author_facet": [
                "OL5470710A Jim Pendrill"
            ]
        },
        {
            "key": "/works/OL10069759W",
            "type": "work",
            "seed": [
                "/books/OL12789685M",
                "/works/OL10069759W",
                "/authors/OL2659937A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL12789685M"
            ],
            "publish_date": [
                "October 31, 2002"
            ],
            "publish_year": [
                2002
            ],
            "first_publish_year": 2002,
            "isbn": [
                "6307245999",
                "9786307245993"
            ],
            "last_modified_i": 1339970513,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "MSI MUSIC"
            ],
            "author_key": [
                "OL2659937A"
            ],
            "author_name": [
                "Various Artists"
            ],
            "author_alternative_name": [
                "Various Artists-Chil Cdmflp         74339",
                "Various Artists-Chil Csmflp         74261",
                "Various Artists-Duff Cd500        8607917",
                "Various Artists-Chri Cdsyw          86675",
                "Cdcolm         30274 Various Artists-Day",
                "Various Artists-Dani Cdmflp         74341",
                "Various Artists-Chri Cdmada          0698",
                "Various artists-Printed in Malaysia- no publication date",
                "Various Artists-Hall Cdpetr          9691",
                "Various Artists-Chil Cdmada          6095",
                "Various Artists-Chil Cdmada          2195",
                "Various Artists-Dail Cd500        8607747",
                "Various Artists-Hook Cdcolm         31134",
                "Various Artists-Clas Cdlase         14059",
                "Various Artists-Chri Cdmada          0696",
                "Various Artists-Rock Cdcolm         30283",
                "Various Artists-Wilc Cdrhin         78279",
                "Various Artists-Gaye Cdrhin         78261",
                "Various Artists-Chil Cdmflp         74261",
                "Various Artists-Moro Cdstru           122",
                "Various Artists-Jazz Cdcolm         61439",
                "Various Artists-Pop  Cd500        8600707",
                "Various Artists-Hall Cdpetr          9687",
                "Various Artists-Chil Cd500        8607762",
                "Various Artists-Jewi Cdkhi         Put182",
                "Various Artists-Subs Cdorh     6991071012",
                "Various Artists-Dust Cdsyw          63517",
                "Various Artists-Chri Cdmada          0691",
                "Various Artists-Chil Cdmflp         78223",
                "Various Artists-With Cdrhin         78262",
                "Various Artists-Clas Cdpolc        010120",
                "Various Artists-Hall Cdpetr          9684",
                "Various Artists-Chil Cdmflp         73964",
                "Various Artists-Chri Cdmada          0693",
                "Various Artists-Hall Cdpetr          9688",
                "Various Artists-Chil Cdmada          2194",
                "Various Artists-Brow Cdrhin         76703",
                "Various Artists-Chri Cdmada          4499",
                "Various Artists-Foxy Csktel          6972",
                "Various Artists-Hall Cdpetr          9686",
                "Various Artists-Radi Cdrdos         27602",
                "Various Artists-Chil Cdmada          2168",
                "Various Artists      Cdumme          1903",
                "Various Artists-Spok Cdmsim        203449",
                "Various Artists-Clas Cdteld         24802",
                "Various Artists-Foxy Csktel          6973",
                "Various Artists-Mexi Cd176        1600662",
                "Various Artists.",
                "Various Artists-Garl Cdrhin         78323",
                "Various Artists-Midl Cd500        8607227",
                "Various Artists-Come Cdcolm         30192",
                "Various Artists-Mila Cd500        8600972",
                "Various Artists-Arno Cdmflp         78252",
                "Various Artists-Gap  Csmflp         76087",
                "Various Artists-Gap  Cdmflp         76087",
                "Various Artists-Chri Csmada          4496",
                "Various Artists-Blue Cd500        8600837",
                "Various Artists-Chil Cdmflp         73963",
                "Various Artists-Gilb Cdnara        10366C",
                "Various Artists-Chil Cdmflp         78362",
                "Various Artists-Chil Cdmflp         74260",
                "Various Artists-Hall Cdpetr          9690",
                "Various Artists-Hall Cdpetr          9683",
                "Various Artists-Lenn Cdmflp         78932",
                "Various Artists-The  Cdorh     6991019332",
                "Various Artists-Nyro Cdcolm         30271",
                "Various Artists-Chil Csmflp         78223",
                "Various Artists-Chil Cdmada          6096",
                "Various Artists-Wyno Cd500        8607342",
                "Various Artists-Jazz Cdcolm         30160",
                "Various Artists-Chil Cdmada          8240",
                "Various Artists-East Cdagro     Crg140122",
                "Various Artists-Pop  Cdefa           4404",
                "Various Artists-Cold Cdatl          83588",
                "Various Artists-Chri Cdbt           30072",
                "Various Artists-Chil Cdmflp         73936",
                "Various Artists-Chil Cd500        8607767",
                "Various Artists-Duff Cd500        8607912",
                "Various Artists-Chri Cdmflp         75539",
                "Various Artists-Clas Cdlase         14054",
                "Various Artists-Chri Cdstce          3538",
                "Various Artists-Chri Cd8627         40700",
                "Various Artists-Chri Cdsyw          86671",
                "Various Artists-Chri Cdmada          0692",
                "Various Artists-Worl Cdagro      Bud82264",
                "Various Artists-Chil Csmflp         73766",
                "Various artists.",
                "Various Artists-Chil Cdmflp         73765",
                "Various Artists-Chil Cdmflp         75729",
                "Various Artists-D'Le Cd500        8600937",
                "Various Artists-TV s Cdrhin         74337",
                "Various Artists-Hall Cdpetr          9685",
                "Various Artists-Chri Cdmada          0697",
                "Various Artists-Chil Cdmada          6058",
                "Various Artists-Chil Csmflp         79842",
                "Various Artists-Chil Csmflp         73765",
                "Various Artists-Wyno Cd500        8607347",
                "Various Artists-Chri Cddelt         46171"
            ],
            "id_goodreads": [
                "2688616"
            ],
            "publisher_facet": [
                "MSI MUSIC"
            ],
            "_version_": 1759740933566365697,
            "author_facet": [
                "OL2659937A Various Artists"
            ]
        },
        {
            "key": "/works/OL30485058W",
            "type": "work",
            "seed": [
                "/books/OL41909948M",
                "/works/OL30485058W",
                "/authors/OL11117793A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL41909948M"
            ],
            "publish_date": [
                "2019"
            ],
            "publish_year": [
                2019
            ],
            "first_publish_year": 2019,
            "isbn": [
                "9781712788691",
                "1712788698"
            ],
            "last_modified_i": 1669659219,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Independently Published"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL11117793A"
            ],
            "author_name": [
                "Edwin Penfold"
            ],
            "publisher_facet": [
                "Independently Published"
            ],
            "_version_": 1759782309006934017,
            "author_facet": [
                "OL11117793A Edwin Penfold"
            ]
        },
        {
            "key": "/works/OL31711215W",
            "type": "work",
            "seed": [
                "/books/OL43398341M",
                "/works/OL31711215W"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL43398341M"
            ],
            "publish_date": [
                "????"
            ],
            "isbn": [
                "0780643321",
                "9780780643321"
            ],
            "last_modified_i": 1670518586,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "_version_": 1759784455933788161
        },
        {
            "key": "/works/OL31351895W",
            "type": "work",
            "seed": [
                "/books/OL43000901M",
                "/works/OL31351895W",
                "/authors/OL10825618A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL43000901M"
            ],
            "publish_date": [
                "????"
            ],
            "isbn": [
                "9780006392484",
                "0006392482"
            ],
            "last_modified_i": 1670366186,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "n/a"
            ],
            "author_key": [
                "OL10825618A"
            ],
            "author_name": [
                "J.R.R. Tolkien"
            ],
            "publisher_facet": [
                "n/a"
            ],
            "_version_": 1759783857064771584,
            "author_facet": [
                "OL10825618A J.R.R. Tolkien"
            ]
        },
        {
            "key": "/works/OL25353670W",
            "type": "work",
            "seed": [
                "/books/OL33970746M",
                "/works/OL25353670W",
                "/subjects/computer_games",
                "/subjects/fantasy_games",
                "/authors/OL9464244A",
                "/authors/OL9464245A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL33970746M"
            ],
            "publish_date": [
                "2004"
            ],
            "publish_year": [
                2004
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 144,
            "isbn": [
                "076154433X",
                "9780761544333"
            ],
            "last_modified_i": 1632880075,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Random House Information Group"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL9464244A",
                "OL9464245A"
            ],
            "author_name": [
                "Prima Temp Authors Staff",
                "Prima Games Staff"
            ],
            "subject": [
                "Computer games",
                "Fantasy games"
            ],
            "publisher_facet": [
                "Random House Information Group"
            ],
            "subject_facet": [
                "Computer games",
                "Fantasy games"
            ],
            "_version_": 1759771909324537856,
            "author_facet": [
                "OL9464244A Prima Temp Authors Staff",
                "OL9464245A Prima Games Staff"
            ],
            "subject_key": [
                "computer_games",
                "fantasy_games"
            ]
        },
        {
            "key": "/works/OL25218571W",
            "type": "work",
            "seed": [
                "/books/OL33662551M",
                "/works/OL25218571W",
                "/subjects/fiction_fantasy_general",
                "/authors/OL3106373A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL33662551M"
            ],
            "publish_date": [
                "2019"
            ],
            "publish_year": [
                2019
            ],
            "first_publish_year": 2019,
            "isbn": [
                "9781682984857",
                "1682984850"
            ],
            "last_modified_i": 1673551437,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Insight Editions"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL3106373A"
            ],
            "author_name": [
                "Insight Editions"
            ],
            "author_alternative_name": [
                "Insight Editions Editors",
                "Insights Insight Editions",
                "Insight Editions Staff",
                "Insight Insight Editions",
                "Editors Of Insight Editions"
            ],
            "subject": [
                "Fiction, fantasy, general"
            ],
            "publisher_facet": [
                "Insight Editions"
            ],
            "subject_facet": [
                "Fiction, fantasy, general"
            ],
            "_version_": 1759771706799423488,
            "author_facet": [
                "OL3106373A Insight Editions"
            ],
            "subject_key": [
                "fiction_fantasy_general"
            ]
        },
        {
            "key": "/works/OL29335928W",
            "type": "work",
            "seed": [
                "/books/OL40331493M",
                "/works/OL29335928W",
                "/subjects/fiction_general",
                "/authors/OL3398638A"
            ],
            "title": "Lords of the Ring",
            "title_suggest": "Lords of the Ring",
            "title_sort": "Lords of the Ring",
            "edition_count": 1,
            "edition_key": [
                "OL40331493M"
            ],
            "publish_date": [
                "1999"
            ],
            "publish_year": [
                1999
            ],
            "first_publish_year": 1999,
            "isbn": [
                "9780749308957",
                "0749308958"
            ],
            "last_modified_i": 1668685186,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Penguin Random House"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL3398638A"
            ],
            "author_name": [
                "Lansdown"
            ],
            "subject": [
                "Fiction, general"
            ],
            "publisher_facet": [
                "Penguin Random House"
            ],
            "subject_facet": [
                "Fiction, general"
            ],
            "_version_": 1759779900287352833,
            "author_facet": [
                "OL3398638A Lansdown"
            ],
            "subject_key": [
                "fiction_general"
            ]
        },
        {
            "key": "/works/OL7284693W",
            "type": "work",
            "seed": [
                "/books/OL10918978M",
                "/works/OL7284693W",
                "/subjects/boxing",
                "/subjects/boxers_(sports)",
                "/subjects/biography",
                "/authors/OL2133665A"
            ],
            "title": "Lords of the Ring",
            "title_suggest": "Lords of the Ring",
            "title_sort": "Lords of the Ring",
            "edition_count": 1,
            "edition_key": [
                "OL10918978M"
            ],
            "publish_date": [
                "August 15, 1998"
            ],
            "publish_year": [
                1998
            ],
            "first_publish_year": 1998,
            "number_of_pages_median": 320,
            "isbn": [
                "9780600595205",
                "060059520X"
            ],
            "last_modified_i": 1595824594,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordsofringgreat0000arno"
            ],
            "ia_collection": [
                "inlibrary",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "inlibrary;internetarchivebooks;printdisabled",
            "lending_edition_s": "OL10918978M",
            "lending_identifier_s": "lordsofringgreat0000arno",
            "printdisabled_s": "OL10918978M",
            "readinglog_count": 1,
            "want_to_read_count": 1,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL10918978M",
            "cover_i": 2539329,
            "publisher": [
                "Hamlyn"
            ],
            "author_key": [
                "OL2133665A"
            ],
            "author_name": [
                "Peter Arnold"
            ],
            "subject": [
                "Boxing",
                "Boxers (Sports)",
                "Biography"
            ],
            "id_goodreads": [
                "883932"
            ],
            "ia_box_id": [
                "IA1886209"
            ],
            "publisher_facet": [
                "Hamlyn"
            ],
            "subject_facet": [
                "Biography",
                "Boxers (Sports)",
                "Boxing"
            ],
            "_version_": 1759798953457483778,
            "author_facet": [
                "OL2133665A Peter Arnold"
            ],
            "subject_key": [
                "biography",
                "boxers_(sports)",
                "boxing"
            ]
        },
        {
            "key": "/works/OL33886826W",
            "type": "work",
            "seed": [
                "/books/OL45870844M",
                "/works/OL33886826W",
                "/authors/OL12265061A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL45870844M"
            ],
            "publish_date": [
                "2011-06-08"
            ],
            "publish_year": [
                2011
            ],
            "first_publish_year": 2011,
            "last_modified_i": 1673750499,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "author_key": [
                "OL12265061A"
            ],
            "author_name": [
                "Elijah Wood, Ian McKellen, Liv Tyler, Viggo Mortensen, Sean Astin, Cate Blanchett, John Rhys-Davies, Bernard Hill, Christopher Lee, Billy Boyd"
            ],
            "id_amazon": [
                "B005529EI2"
            ],
            "id_better_world_books": [
                "BWB38701188"
            ],
            "_version_": 1759788723888717824,
            "author_facet": [
                "OL12265061A Elijah Wood, Ian McKellen, Liv Tyler, Viggo Mortensen, Sean Astin, Cate Blanchett, John Rhys-Davies, Bernard Hill, Christopher Lee, Billy Boyd"
            ]
        },
        {
            "key": "/works/OL33984094W",
            "type": "work",
            "seed": [
                "/books/OL45976563M",
                "/works/OL33984094W",
                "/authors/OL12298002A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL45976563M"
            ],
            "publish_date": [
                "2010-02-24"
            ],
            "publish_year": [
                2010
            ],
            "first_publish_year": 2010,
            "last_modified_i": 1673789576,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "author_key": [
                "OL12298002A"
            ],
            "author_name": [
                "Elijah Wood, Ian McKellen, Liv Tyler, Viggo Mortensen, Sean Astin, Cate Blanchett, John Rhys-Davies, Bernard Hill, Billy Boyd, Dominic Monaghan"
            ],
            "id_amazon": [
                "B0037WP83M"
            ],
            "id_better_world_books": [
                "BWB34787753"
            ],
            "_version_": 1759789076971520001,
            "author_facet": [
                "OL12298002A Elijah Wood, Ian McKellen, Liv Tyler, Viggo Mortensen, Sean Astin, Cate Blanchett, John Rhys-Davies, Bernard Hill, Billy Boyd, Dominic Monaghan"
            ]
        },
        {
            "key": "/works/OL34507831W",
            "type": "work",
            "seed": [
                "/books/OL46810098M",
                "/works/OL34507831W",
                "/authors/OL9344201A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL46810098M"
            ],
            "publish_date": [
                "2023"
            ],
            "publish_year": [
                2023
            ],
            "first_publish_year": 2023,
            "isbn": [
                "9798886632552"
            ],
            "last_modified_i": 1676662197,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Insight Editions"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL9344201A"
            ],
            "author_name": [
                "Insights"
            ],
            "publisher_facet": [
                "Insight Editions"
            ],
            "_version_": 1759789992427651072,
            "author_facet": [
                "OL9344201A Insights"
            ]
        },
        {
            "key": "/works/OL4825661W",
            "type": "work",
            "seed": [
                "/books/OL2242338M",
                "/works/OL4825661W",
                "/subjects/animal_trainers",
                "/subjects/biography",
                "/subjects/gebel-williams_gunther",
                "/subjects/gebel-williams_gunther_1934-",
                "/subjects/place:united_states",
                "/authors/OL1019020A"
            ],
            "title": "Lord of the rings",
            "title_suggest": "Lord of the rings",
            "title_sort": "Lord of the rings",
            "edition_count": 1,
            "edition_key": [
                "OL2242338M"
            ],
            "publish_date": [
                "1988"
            ],
            "publish_year": [
                1988
            ],
            "first_publish_year": 1988,
            "number_of_pages_median": 116,
            "lccn": [
                "89114713"
            ],
            "publish_place": [
                "[Washington, D.C.] (3201 New Mexico Ave., N.W., Washington 20016)"
            ],
            "contributor": [
                "Gebel-Williams, Gunther, 1934-"
            ],
            "lcc": [
                "GV-1811.00000000.G29 R67 1988"
            ],
            "ddc": [
                "636.0888"
            ],
            "last_modified_i": 1604944268,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Ringling Bros. and Barnum & Bailey Combined Shows"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL1019020A"
            ],
            "author_name": [
                "Susan Rosenkranz"
            ],
            "place": [
                "United States"
            ],
            "subject": [
                "Animal trainers",
                "Biography",
                "Gebel-Williams, Gunther,",
                "Gebel-Williams, Gunther, 1934-"
            ],
            "publisher_facet": [
                "Ringling Bros. and Barnum & Bailey Combined Shows"
            ],
            "place_key": [
                "united_states"
            ],
            "subject_facet": [
                "Animal trainers",
                "Biography",
                "Gebel-Williams, Gunther,",
                "Gebel-Williams, Gunther, 1934-"
            ],
            "_version_": 1759793490809585664,
            "place_facet": [
                "United States"
            ],
            "lcc_sort": "GV-1811.00000000.G29 R67 1988",
            "author_facet": [
                "OL1019020A Susan Rosenkranz"
            ],
            "subject_key": [
                "animal_trainers",
                "biography",
                "gebel-williams_gunther",
                "gebel-williams_gunther_1934-"
            ],
            "ddc_sort": "636.0888"
        },
        {
            "key": "/works/OL17863022W",
            "type": "work",
            "seed": [
                "/books/OL1126026M",
                "/works/OL17863022W",
                "/subjects/lord_of_the_rings_(game)",
                "/subjects/games",
                "/subjects/video_&_electronic",
                "/subjects/gamebooks",
                "/subjects/super_nintendo_entertainment_system",
                "/subjects/snes",
                "/subjects/video_games",
                "/subjects/videogames",
                "/subjects/strategy",
                "/subjects/passtimes",
                "/subjects/hobbies",
                "/subjects/electronic_entertainment",
                "/subjects/video_&_electronic_-_general",
                "/subjects/nintendo_games",
                "/subjects/j.r.r._tolkien",
                "/subjects/adventure",
                "/subjects/role_playing_game",
                "/subjects/rpg",
                "/subjects/the_hobbit",
                "/subjects/hobbit",
                "/subjects/the_lord_of_the_rings",
                "/subjects/lord_of_the_rings",
                "/subjects/the_fellowship_of_the_ring",
                "/subjects/fellowship_of_the_ring",
                "/subjects/middle-earth",
                "/subjects/computer_games",
                "/subjects/person:j.r.r._tolkien",
                "/subjects/person:john_ronald_reuel_tolkien",
                "/authors/OL407564A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "subtitle": "Official Game Secrets",
            "edition_count": 1,
            "edition_key": [
                "OL1126026M"
            ],
            "publish_date": [
                "1995"
            ],
            "publish_year": [
                1995
            ],
            "first_publish_year": 1995,
            "number_of_pages_median": 122,
            "lccn": [
                "94068401"
            ],
            "publish_place": [
                "Rocklin, CA"
            ],
            "oclc": [
                "32348637"
            ],
            "lcc": [
                "GV-1469.35000000.L67 S38 1995",
                "GV-1469.35000000.L67S38"
            ],
            "ddc": [
                "794.815365"
            ],
            "isbn": [
                "9781559586757",
                "1559586753"
            ],
            "last_modified_i": 1632885382,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL1126026M",
            "cover_i": 8166951,
            "publisher": [
                "Prima Publishing"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL407564A"
            ],
            "author_name": [
                "Steven A. Schwartz"
            ],
            "author_alternative_name": [
                "Steven Schwartz",
                "Steve Schwartz"
            ],
            "person": [
                "J.R.R. Tolkien",
                "John Ronald Reuel Tolkien"
            ],
            "subject": [
                "Lord of the Rings (Game)",
                "Games",
                "Video & Electronic",
                "Gamebooks",
                "Super Nintendo Entertainment System",
                "SNES",
                "Video games",
                "Videogames",
                "Strategy",
                "Passtimes",
                "Hobbies",
                "Electronic Entertainment",
                "Video & Electronic - General",
                "Nintendo Games",
                "J.R.R. Tolkien",
                "Adventure",
                "Role Playing Game",
                "RPG",
                "The Hobbit",
                "Hobbit",
                "The Lord of the Rings",
                "Lord of the Rings",
                "The Fellowship of the Ring",
                "Fellowship of the Ring",
                "Middle-earth",
                "Computer games"
            ],
            "id_goodreads": [
                "2640694"
            ],
            "publisher_facet": [
                "Prima Publishing"
            ],
            "person_key": [
                "j.r.r._tolkien",
                "john_ronald_reuel_tolkien"
            ],
            "person_facet": [
                "J.R.R. Tolkien",
                "John Ronald Reuel Tolkien"
            ],
            "subject_facet": [
                "Adventure",
                "Computer games",
                "Electronic Entertainment",
                "Fellowship of the Ring",
                "Gamebooks",
                "Games",
                "Hobbies",
                "Hobbit",
                "J.R.R. Tolkien",
                "Lord of the Rings",
                "Lord of the Rings (Game)",
                "Middle-earth",
                "Nintendo Games",
                "Passtimes",
                "RPG",
                "Role Playing Game",
                "SNES",
                "Strategy",
                "Super Nintendo Entertainment System",
                "The Fellowship of the Ring",
                "The Hobbit",
                "The Lord of the Rings",
                "Video & Electronic",
                "Video & Electronic - General",
                "Video games",
                "Videogames"
            ],
            "_version_": 1759756369890639872,
            "lcc_sort": "GV-1469.35000000.L67 S38 1995",
            "author_facet": [
                "OL407564A Steven A. Schwartz"
            ],
            "subject_key": [
                "adventure",
                "computer_games",
                "electronic_entertainment",
                "fellowship_of_the_ring",
                "gamebooks",
                "games",
                "hobbies",
                "hobbit",
                "j.r.r._tolkien",
                "lord_of_the_rings",
                "lord_of_the_rings_(game)",
                "middle-earth",
                "nintendo_games",
                "passtimes",
                "role_playing_game",
                "rpg",
                "snes",
                "strategy",
                "super_nintendo_entertainment_system",
                "the_fellowship_of_the_ring",
                "the_hobbit",
                "the_lord_of_the_rings",
                "video__electronic",
                "video__electronic_-_general",
                "video_games",
                "videogames"
            ],
            "ddc_sort": "794.815365"
        },
        {
            "key": "/works/OL20652017W",
            "type": "work",
            "seed": [
                "/books/OL11445939M",
                "/works/OL20652017W",
                "/authors/OL232901A"
            ],
            "title": "Lords of the Ring",
            "title_suggest": "Lords of the Ring",
            "title_sort": "Lords of the Ring",
            "edition_count": 1,
            "edition_key": [
                "OL11445939M"
            ],
            "publish_date": [
                "1987"
            ],
            "publish_year": [
                1987
            ],
            "first_publish_year": 1987,
            "isbn": [
                "092101404X",
                "9780921014041"
            ],
            "last_modified_i": 1677231043,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL11445939M",
            "cover_i": 13340334,
            "publisher": [
                "Pulse"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL232901A"
            ],
            "author_name": [
                "Bruce Blackadar"
            ],
            "id_librarything": [
                "5808468"
            ],
            "publisher_facet": [
                "Pulse"
            ],
            "_version_": 1759762654473224193,
            "author_facet": [
                "OL232901A Bruce Blackadar"
            ]
        },
        {
            "key": "/works/OL1698390W",
            "type": "work",
            "seed": [
                "/books/OL7866471M",
                "/works/OL1698390W",
                "/authors/OL193277A"
            ],
            "title": "Lords of the ring",
            "title_suggest": "Lords of the ring",
            "title_sort": "Lords of the ring",
            "edition_count": 1,
            "edition_key": [
                "OL7866471M"
            ],
            "publish_date": [
                "1980"
            ],
            "publish_year": [
                1980
            ],
            "first_publish_year": 1980,
            "isbn": [
                "0726913952",
                "9780726913952"
            ],
            "last_modified_i": 1281081785,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Cassell Australia"
            ],
            "author_key": [
                "OL193277A"
            ],
            "author_name": [
                "Peter Corris"
            ],
            "id_goodreads": [
                "3235512"
            ],
            "id_librarything": [
                "1180072"
            ],
            "publisher_facet": [
                "Cassell Australia"
            ],
            "_version_": 1759754469046747136,
            "author_facet": [
                "OL193277A Peter Corris"
            ]
        },
        {
            "key": "/works/OL17076676W",
            "type": "work",
            "seed": [
                "/books/OL25646462M",
                "/works/OL17076676W",
                "/authors/OL1480405A"
            ],
            "title": "Lord of the Rings",
            "title_suggest": "Lord of the Rings",
            "title_sort": "Lord of the Rings",
            "subtitle": "Apocalyptic Prophecies",
            "edition_count": 1,
            "edition_key": [
                "OL25646462M"
            ],
            "publish_date": [
                "December 8, 2014"
            ],
            "publish_year": [
                2014
            ],
            "first_publish_year": 2014,
            "number_of_pages_median": 100,
            "last_modified_i": 1487344641,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL25646462M",
            "cover_i": 7316499,
            "publisher": [
                "Scribd.com"
            ],
            "author_key": [
                "OL1480405A"
            ],
            "author_name": [
                "E.A. Bucchianeri"
            ],
            "publisher_facet": [
                "Scribd.com"
            ],
            "_version_": 1759754537979084802,
            "author_facet": [
                "OL1480405A E.A. Bucchianeri"
            ]
        },
        {
            "key": "/works/OL10367789W",
            "type": "work",
            "seed": [
                "/books/OL13585743M",
                "/books/OL23269856M",
                "/books/OL24276648M",
                "/works/OL10367789W",
                "/subjects/literary_criticism",
                "/subjects/nonfiction",
                "/subjects/english_literature_history_and_criticism_20th_century",
                "/subjects/british_and_irish_fiction_(fictional_works_by_one_author)",
                "/subjects/literary_criticism",
                "/subjects/european",
                "/subjects/english_irish_scottish_welsh",
                "/subjects/hobbit_(tolkien_j._r._r.)",
                "/subjects/lord_of_the_rings_(tolkien_j._r._r.)",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL4292471A"
            ],
            "title": "Tolkien's The Lord of the Rings and The hobbit",
            "title_suggest": "Tolkien's The Lord of the Rings and The hobbit",
            "title_sort": "Tolkien's The Lord of the Rings and The hobbit",
            "edition_count": 3,
            "edition_key": [
                "OL13585743M",
                "OL23269856M",
                "OL24276648M"
            ],
            "publish_date": [
                "2002",
                "1977"
            ],
            "publish_year": [
                2002,
                1977
            ],
            "first_publish_year": 1977,
            "number_of_pages_median": 75,
            "publish_place": [
                "New York",
                "Lincoln, Neb"
            ],
            "oclc": [
                "44961550"
            ],
            "lcc": [
                "PR-6039.00000000.O32Z655 1977",
                "PR-6039.00000000.O32 Z655 1977eb"
            ],
            "isbn": [
                "9780822012863",
                "0822071215",
                "0822012863",
                "9780822071211"
            ],
            "last_modified_i": 1677604315,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "tolkienslordofri00hard"
            ],
            "ia_collection": [
                "americana",
                "delawarecountydistrictlibrary",
                "inlibrary",
                "internetarchivebooks",
                "library_of_atlantis",
                "openlibrary-d-ol",
                "printdisabled",
                "stmaryscountylibrary",
                "uni-ol"
            ],
            "ia_collection_s": "americana;delawarecountydistrictlibrary;inlibrary;internetarchivebooks;library_of_atlantis;openlibrary-d-ol;printdisabled;stmaryscountylibrary;uni-ol",
            "lending_edition_s": "OL13585743M",
            "lending_identifier_s": "tolkienslordofri00hard",
            "printdisabled_s": "OL13585743M",
            "readinglog_count": 2,
            "want_to_read_count": 2,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL13585743M",
            "cover_i": 621763,
            "publisher": [
                "Cliff's Notes",
                "Cliffs Notes",
                "John Wiley & Sons, Ltd."
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL4292471A"
            ],
            "author_name": [
                "Gene B. Hardy"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "Literary Criticism",
                "Nonfiction",
                "English literature, history and criticism, 20th century",
                "British and irish fiction (fictional works by one author)",
                "LITERARY CRITICISM",
                "European",
                "English, Irish, Scottish, Welsh",
                "Hobbit (Tolkien, J. R. R.)",
                "Lord of the rings (Tolkien, J. R. R.)"
            ],
            "id_goodreads": [
                "15293"
            ],
            "id_librarything": [
                "606517"
            ],
            "id_overdrive": [
                "90DE0629-7C03-469B-ADB7-6BDB81C2EC70"
            ],
            "ia_box_id": [
                "ia127120"
            ],
            "publisher_facet": [
                "Cliff's Notes",
                "Cliffs Notes",
                "John Wiley & Sons, Ltd."
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "British and irish fiction (fictional works by one author)",
                "English literature, history and criticism, 20th century",
                "English, Irish, Scottish, Welsh",
                "European",
                "Hobbit (Tolkien, J. R. R.)",
                "LITERARY CRITICISM",
                "Literary Criticism",
                "Lord of the rings (Tolkien, J. R. R.)",
                "Nonfiction"
            ],
            "_version_": 1759885855308120064,
            "lcc_sort": "PR-6039.00000000.O32 Z655 1977eb",
            "author_facet": [
                "OL4292471A Gene B. Hardy"
            ],
            "subject_key": [
                "british_and_irish_fiction_(fictional_works_by_one_author)",
                "english_irish_scottish_welsh",
                "english_literature_history_and_criticism_20th_century",
                "european",
                "hobbit_(tolkien_j._r._r.)",
                "literary_criticism",
                "lord_of_the_rings_(tolkien_j._r._r.)",
                "nonfiction"
            ]
        },
        {
            "key": "/works/OL18146934W",
            "type": "work",
            "seed": [
                "/books/OL20513187M",
                "/books/OL20930388M",
                "/works/OL18146934W",
                "/subjects/tolkien_j._r._r._--_1892-1973.",
                "/authors/OL3519429A"
            ],
            "title": "The Lord of the Rings / The Hobbit",
            "title_suggest": "The Lord of the Rings / The Hobbit",
            "title_sort": "The Lord of the Rings / The Hobbit",
            "edition_count": 2,
            "edition_key": [
                "OL20513187M",
                "OL20930388M"
            ],
            "publish_date": [
                "1979"
            ],
            "publish_year": [
                1979
            ],
            "first_publish_year": 1979,
            "number_of_pages_median": 130,
            "publish_place": [
                "Toronto"
            ],
            "isbn": [
                "9780774011181",
                "0774011181"
            ],
            "last_modified_i": 1575123805,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Coles"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL3519429A"
            ],
            "author_name": [
                "Coles Editorial Board"
            ],
            "author_alternative_name": [
                "Coles Publishing Company Limited. Editorial Board.",
                "Coles Ediorial Board.",
                "COLES EDITORIAL BOARD.",
                "Coles editorial Board.",
                "Coles Editoral Board.",
                "Coles Editorial Board.",
                "Coles Notes Editorial Board"
            ],
            "subject": [
                "Tolkien, J. R. R. -- 1892-1973."
            ],
            "id_librarything": [
                "2271985"
            ],
            "publisher_facet": [
                "Coles"
            ],
            "subject_facet": [
                "Tolkien, J. R. R. -- 1892-1973."
            ],
            "_version_": 1759756835636641792,
            "author_facet": [
                "OL3519429A Coles Editorial Board"
            ],
            "subject_key": [
                "tolkien_j._r._r._--_1892-1973."
            ]
        },
        {
            "key": "/works/OL5758759W",
            "type": "work",
            "seed": [
                "/books/OL7261991M",
                "/books/OL9216706M",
                "/works/OL5758759W",
                "/authors/OL1401384A"
            ],
            "title": "The Art of the \"Fellowship of the Ring\" (\"Lord of the Rings\")",
            "title_suggest": "The Art of the \"Fellowship of the Ring\" (\"Lord of the Rings\")",
            "title_sort": "The Art of the \"Fellowship of the Ring\" (\"Lord of the Rings\")",
            "edition_count": 2,
            "edition_key": [
                "OL7261991M",
                "OL9216706M"
            ],
            "publish_date": [
                "June 17, 2002"
            ],
            "publish_year": [
                2002
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 192,
            "isbn": [
                "9780007135639",
                "0007135637"
            ],
            "last_modified_i": 1582909418,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL9216706M",
            "cover_i": 9953,
            "publisher": [
                "HarperCollins Publishers Ltd"
            ],
            "author_key": [
                "OL1401384A"
            ],
            "author_name": [
                "Gary Russell"
            ],
            "id_goodreads": [
                "15244"
            ],
            "id_librarything": [
                "43376"
            ],
            "publisher_facet": [
                "HarperCollins Publishers Ltd"
            ],
            "_version_": 1759795522518908928,
            "author_facet": [
                "OL1401384A Gary Russell"
            ]
        },
        {
            "key": "/works/OL8436036W",
            "type": "work",
            "seed": [
                "/books/OL9383739M",
                "/books/OL9681472M",
                "/works/OL8436036W",
                "/authors/OL2812708A"
            ],
            "title": "Art of the Lord of the Rings",
            "title_suggest": "Art of the Lord of the Rings",
            "title_sort": "Art of the Lord of the Rings",
            "edition_count": 2,
            "edition_key": [
                "OL9383739M",
                "OL9681472M"
            ],
            "publish_date": [
                "July 1, 2005"
            ],
            "publish_year": [
                2005
            ],
            "first_publish_year": 2005,
            "number_of_pages_median": 24,
            "isbn": [
                "9780740751875",
                "0740751875",
                "9780740751868",
                "0740751867"
            ],
            "last_modified_i": 1281609206,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL9681472M",
            "cover_i": 1380164,
            "publisher": [
                "Andrews McMeel Publishing"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL2812708A"
            ],
            "author_name": [
                "Andrews McMeel Publishing"
            ],
            "author_alternative_name": [
                "Andrews McMeel Publishing LLC"
            ],
            "id_goodreads": [
                "15365"
            ],
            "id_librarything": [
                "3581486"
            ],
            "publisher_facet": [
                "Andrews McMeel Publishing"
            ],
            "_version_": 1759801242206339072,
            "author_facet": [
                "OL2812708A Andrews McMeel Publishing"
            ]
        },
        {
            "key": "/works/OL21111170W",
            "type": "work",
            "seed": [
                "/books/OL28576695M",
                "/books/OL46065008M",
                "/works/OL21111170W",
                "/subjects/tolkien_j_r._r._(john_ronald_ruel)_1892-1973",
                "/authors/OL26320A",
                "/authors/OL39015A",
                "/authors/OL2623691A"
            ],
            "title": "Art of the Lord of the Rings",
            "title_suggest": "Art of the Lord of the Rings",
            "title_sort": "Art of the Lord of the Rings",
            "edition_count": 2,
            "edition_key": [
                "OL28576695M",
                "OL46065008M"
            ],
            "publish_date": [
                "2015",
                "2023"
            ],
            "publish_year": [
                2015,
                2023
            ],
            "first_publish_year": 2015,
            "number_of_pages_median": 240,
            "lcc": [
                "PR-6039.00000000.O32"
            ],
            "isbn": [
                "9780008105754",
                "0008601410",
                "9780008601416",
                "0008105758"
            ],
            "last_modified_i": 1673932888,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "HarperCollins Publishers Limited"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL26320A",
                "OL39015A",
                "OL2623691A"
            ],
            "author_name": [
                "J.R.R. Tolkien",
                "Wayne G. Hammond",
                "Christina Scull"
            ],
            "author_alternative_name": [
                "J.R.R. Tolkein",
                "J. R. R. Tolkien",
                "Dzhon R. R. Tolkin",
                "Yue Han Luo Na De Rui Er Tuo Er Jin",
                "J. R. R. Tolkein",
                "John Ronald Reuel Tolkien"
            ],
            "subject": [
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "publisher_facet": [
                "HarperCollins Publishers Limited"
            ],
            "subject_facet": [
                "Tolkien, j, r. r. (john ronald ruel), 1892-1973"
            ],
            "_version_": 1759763645989912576,
            "lcc_sort": "PR-6039.00000000.O32",
            "author_facet": [
                "OL2623691A Christina Scull",
                "OL26320A J.R.R. Tolkien",
                "OL39015A Wayne G. Hammond"
            ],
            "subject_key": [
                "tolkien_j_r._r._(john_ronald_ruel)_1892-1973"
            ]
        },
        {
            "key": "/works/OL11222810M",
            "type": "work",
            "seed": [
                "/books/OL11222810M",
                "/works/OL11222810M",
                "/subjects/audio_adult:_books_on_tape"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL11222810M"
            ],
            "publish_date": [
                "November 1985"
            ],
            "publish_year": [
                1985
            ],
            "first_publish_year": 1985,
            "isbn": [
                "9780881420784",
                "0881420786"
            ],
            "last_modified_i": 1678280737,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Soundelux Audio Pub"
            ],
            "subject": [
                "Audio Adult: Books On Tape"
            ],
            "id_librarything": [
                "3209014"
            ],
            "publisher_facet": [
                "Soundelux Audio Pub"
            ],
            "subject_facet": [
                "Audio Adult: Books On Tape"
            ],
            "_version_": 1759804903006404609,
            "subject_key": [
                "audio_adult_books_on_tape"
            ]
        },
        {
            "key": "/works/OL14933438W",
            "type": "work",
            "seed": [
                "/books/OL8821524M",
                "/works/OL14933438W",
                "/authors/OL6916799A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL8821524M"
            ],
            "publish_date": [
                "September 1, 2002"
            ],
            "publish_year": [
                2002
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 80,
            "isbn": [
                "1586637908",
                "9781586637903"
            ],
            "last_modified_i": 1547622765,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL8821524M",
            "cover_i": 4853661,
            "publisher": [
                "SparkNotes"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL6916799A"
            ],
            "author_name": [
                "Patrick Gardner"
            ],
            "id_goodreads": [
                "54698"
            ],
            "id_librarything": [
                "8204903"
            ],
            "publisher_facet": [
                "SparkNotes"
            ],
            "_version_": 1759749786265714690,
            "author_facet": [
                "OL6916799A Patrick Gardner"
            ]
        },
        {
            "key": "/works/OL31654551W",
            "type": "work",
            "seed": [
                "/books/OL43335241M",
                "/works/OL31654551W",
                "/authors/OL3053048A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL43335241M"
            ],
            "publish_date": [
                "2001-01-01"
            ],
            "publish_year": [
                2001
            ],
            "first_publish_year": 2001,
            "isbn": [
                "5011921951246"
            ],
            "last_modified_i": 1673726768,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Games Workshop"
            ],
            "author_key": [
                "OL3053048A"
            ],
            "author_name": [
                "Rick Priestly"
            ],
            "id_amazon": [
                "",
                "B000K04UBA"
            ],
            "publisher_facet": [
                "Games Workshop"
            ],
            "_version_": 1759784565010857984,
            "author_facet": [
                "OL3053048A Rick Priestly"
            ]
        },
        {
            "key": "/works/OL28595323W",
            "type": "work",
            "seed": [
                "/books/OL39207226M",
                "/works/OL28595323W",
                "/authors/OL26320A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL39207226M"
            ],
            "publish_date": [
                "Nov 01, 1985"
            ],
            "publish_year": [
                1985
            ],
            "first_publish_year": 1985,
            "isbn": [
                "9780881422702",
                "0881422703"
            ],
            "last_modified_i": 1661341253,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "Brand: Soundelux Audio Pub",
                "Soundelux Audio Pub"
            ],
            "author_key": [
                "OL26320A"
            ],
            "author_name": [
                "J.R.R. Tolkien"
            ],
            "author_alternative_name": [
                "J.R.R. Tolkein",
                "John Ronald Reuel Tolkien",
                "J. R. R. Tolkein",
                "Yue Han Luo Na De Rui Er Tuo Er Jin",
                "J. R. R. Tolkien",
                "Dzhon R. R. Tolkin"
            ],
            "publisher_facet": [
                "Brand: Soundelux Audio Pub",
                "Soundelux Audio Pub"
            ],
            "_version_": 1759778412471255040,
            "author_facet": [
                "OL26320A J.R.R. Tolkien"
            ]
        },
        {
            "key": "/works/OL33733658W",
            "type": "work",
            "seed": [
                "/books/OL45700825M",
                "/works/OL33733658W"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL45700825M"
            ],
            "publish_date": [
                "2012-01-31"
            ],
            "publish_year": [
                2012
            ],
            "first_publish_year": 2012,
            "isbn": [
                "0794043554223"
            ],
            "last_modified_i": 1673682395,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "New Line Home Video"
            ],
            "id_amazon": [
                "B00003CWT6"
            ],
            "publisher_facet": [
                "New Line Home Video"
            ],
            "_version_": 1759788393477177344
        },
        {
            "key": "/works/OL27030131W",
            "type": "work",
            "seed": [
                "/books/OL36643488M",
                "/works/OL27030131W",
                "/subjects/fantasy_fiction",
                "/subjects/british_and_irish_fiction_(fictional_works_by_one_author)",
                "/subjects/fiction_fantasy_epic",
                "/subjects/middle_earth_(imaginary_place)_fiction",
                "/subjects/baggins_frodo_(fictitious_character)_fiction",
                "/authors/OL26320A"
            ],
            "title": "The lord of the rings",
            "title_suggest": "The lord of the rings",
            "title_sort": "The lord of the rings",
            "edition_count": 1,
            "edition_key": [
                "OL36643488M"
            ],
            "publish_date": [
                "1991"
            ],
            "publish_year": [
                1991
            ],
            "first_publish_year": 1991,
            "publish_place": [
                "London"
            ],
            "oclc": [
                "1067124928"
            ],
            "lcc": [
                "PR-6039.00000000.O32 L6 2010"
            ],
            "isbn": [
                "9780007887668",
                "0007887663",
                "9780007887682",
                "9780007887675",
                "000788768X",
                "0007887671"
            ],
            "last_modified_i": 1675300215,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL36643488M",
            "cover_i": 12536395,
            "publisher": [
                "HarperCollins"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL26320A"
            ],
            "author_name": [
                "J.R.R. Tolkien"
            ],
            "author_alternative_name": [
                "Dzhon R. R. Tolkin",
                "J.R.R. Tolkein",
                "Yue Han Luo Na De Rui Er Tuo Er Jin",
                "J. R. R. Tolkein",
                "John Ronald Reuel Tolkien",
                "J. R. R. Tolkien"
            ],
            "subject": [
                "Fantasy fiction",
                "British and irish fiction (fictional works by one author)",
                "Fiction, fantasy, epic",
                "Middle earth (imaginary place), fiction",
                "Baggins, frodo (fictitious character), fiction"
            ],
            "publisher_facet": [
                "HarperCollins"
            ],
            "subject_facet": [
                "Baggins, frodo (fictitious character), fiction",
                "British and irish fiction (fictional works by one author)",
                "Fantasy fiction",
                "Fiction, fantasy, epic",
                "Middle earth (imaginary place), fiction"
            ],
            "_version_": 1759775156142604290,
            "lcc_sort": "PR-6039.00000000.O32 L6 2010",
            "author_facet": [
                "OL26320A J.R.R. Tolkien"
            ],
            "subject_key": [
                "baggins_frodo_(fictitious_character)_fiction",
                "british_and_irish_fiction_(fictional_works_by_one_author)",
                "fantasy_fiction",
                "fiction_fantasy_epic",
                "middle_earth_(imaginary_place)_fiction"
            ]
        },
        {
            "key": "/works/OL26427835W",
            "type": "work",
            "seed": [
                "/books/OL35698544M",
                "/works/OL26427835W",
                "/subjects/fiction_fantasy_epic",
                "/subjects/baggins_frodo_(fictitious_character)_fiction",
                "/subjects/middle_earth_(imaginary_place)_fiction",
                "/subjects/gandalf_(fictitious_character)_fiction",
                "/subjects/british_and_irish_fiction_(fictional_works_by_one_author)",
                "/authors/OL9959958A"
            ],
            "title": "The Lord of The Rings",
            "title_suggest": "The Lord of The Rings",
            "title_sort": "The Lord of The Rings",
            "edition_count": 1,
            "edition_key": [
                "OL35698544M"
            ],
            "publish_date": [
                "Dec 07, 2001"
            ],
            "publish_year": [
                2001
            ],
            "first_publish_year": 2001,
            "number_of_pages_median": 1152,
            "isbn": [
                "0261103687",
                "9780261103689"
            ],
            "last_modified_i": 1671247366,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL35698544M",
            "cover_i": 12393153,
            "publisher": [
                "Houghton Mifflin"
            ],
            "author_key": [
                "OL9959958A"
            ],
            "author_name": [
                "J. R. R. Tolkien; Brian Sibley"
            ],
            "subject": [
                "Fiction, fantasy, epic",
                "Baggins, frodo (fictitious character), fiction",
                "Middle earth (imaginary place), fiction",
                "Gandalf (fictitious character), fiction",
                "British and irish fiction (fictional works by one author)"
            ],
            "publisher_facet": [
                "Houghton Mifflin"
            ],
            "subject_facet": [
                "Baggins, frodo (fictitious character), fiction",
                "British and irish fiction (fictional works by one author)",
                "Fiction, fantasy, epic",
                "Gandalf (fictitious character), fiction",
                "Middle earth (imaginary place), fiction"
            ],
            "_version_": 1759774056569110528,
            "author_facet": [
                "OL9959958A J. R. R. Tolkien; Brian Sibley"
            ],
            "subject_key": [
                "baggins_frodo_(fictitious_character)_fiction",
                "british_and_irish_fiction_(fictional_works_by_one_author)",
                "fiction_fantasy_epic",
                "gandalf_(fictitious_character)_fiction",
                "middle_earth_(imaginary_place)_fiction"
            ]
        },
        {
            "key": "/works/OL28758970W",
            "type": "work",
            "seed": [
                "/books/OL39470022M",
                "/works/OL28758970W",
                "/authors/OL8046374A",
                "/authors/OL8085862A",
                "/authors/OL1606992A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL39470022M"
            ],
            "publish_date": [
                "Aug 20, 2002"
            ],
            "publish_year": [
                2002
            ],
            "first_publish_year": 2002,
            "isbn": [
                "078063702X",
                "9780780637023"
            ],
            "last_modified_i": 1661009244,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "New Line Home Entertainment"
            ],
            "author_key": [
                "OL8046374A",
                "OL8085862A",
                "OL1606992A"
            ],
            "author_name": [
                "Liv Tyler",
                "Cate Blanchett",
                "Jackson, Peter"
            ],
            "publisher_facet": [
                "New Line Home Entertainment"
            ],
            "_version_": 1759778703743647744,
            "author_facet": [
                "OL1606992A Jackson, Peter",
                "OL8046374A Liv Tyler",
                "OL8085862A Cate Blanchett"
            ]
        },
        {
            "key": "/works/OL7908921W",
            "type": "work",
            "seed": [
                "/books/OL9776467M",
                "/works/OL7908921W",
                "/authors/OL3266555A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL9776467M"
            ],
            "publish_date": [
                "May 2000"
            ],
            "publish_year": [
                2000
            ],
            "first_publish_year": 2000,
            "number_of_pages_median": 44,
            "oclc": [
                "57484284"
            ],
            "contributor": [
                "J. R. R. Tolkien (Creator)"
            ],
            "isbn": [
                "0261104039",
                "9780261104037"
            ],
            "last_modified_i": 1668448247,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL9776467M",
            "cover_i": 149318,
            "publisher": [
                "Harpercollins Pub Ltd"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL3266555A"
            ],
            "author_name": [
                "Ted Nasmith"
            ],
            "id_goodreads": [
                "15355"
            ],
            "id_librarything": [
                "786659"
            ],
            "publisher_facet": [
                "Harpercollins Pub Ltd"
            ],
            "_version_": 1759800210250268672,
            "author_facet": [
                "OL3266555A Ted Nasmith"
            ]
        },
        {
            "key": "/works/OL8120484W",
            "type": "work",
            "seed": [
                "/books/OL12307327M",
                "/works/OL8120484W",
                "/authors/OL2704059A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL12307327M"
            ],
            "number_of_pages_median": 82,
            "isbn": [
                "1931334706",
                "9781931334709"
            ],
            "last_modified_i": 1272134414,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "language": [
                "eng"
            ],
            "author_key": [
                "OL2704059A"
            ],
            "author_name": [
                "Wendy Conklin"
            ],
            "id_goodreads": [
                "3007744"
            ],
            "_version_": 1759800846939324417,
            "author_facet": [
                "OL2704059A Wendy Conklin"
            ]
        },
        {
            "key": "/works/OL8270320W",
            "type": "work",
            "seed": [
                "/books/OL7662927M",
                "/works/OL8270320W",
                "/authors/OL738083A",
                "/authors/OL801796A"
            ],
            "title": "The lords of the rings",
            "title_suggest": "The lords of the rings",
            "title_sort": "The lords of the rings",
            "edition_count": 1,
            "edition_key": [
                "OL7662927M"
            ],
            "publish_date": [
                "1992"
            ],
            "publish_year": [
                1992
            ],
            "first_publish_year": 1992,
            "number_of_pages_median": 288,
            "isbn": [
                "0671711229",
                "9780671711221"
            ],
            "last_modified_i": 1554402709,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 1,
            "want_to_read_count": 0,
            "currently_reading_count": 0,
            "already_read_count": 1,
            "publisher": [
                "Stoddart Pub. Co."
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL738083A",
                "OL801796A"
            ],
            "author_name": [
                "Vyv Simson",
                "Andrew Jennings"
            ],
            "id_goodreads": [
                "1090327"
            ],
            "id_librarything": [
                "6036356"
            ],
            "publisher_facet": [
                "Stoddart Pub. Co."
            ],
            "_version_": 1759800924980641792,
            "author_facet": [
                "OL738083A Vyv Simson",
                "OL801796A Andrew Jennings"
            ]
        },
        {
            "key": "/works/OL8495954W",
            "type": "work",
            "seed": [
                "/books/OL8018301M",
                "/works/OL8495954W",
                "/subjects/lord_of_the_rings_(game)",
                "/subjects/games",
                "/subjects/video_&_electronic",
                "/subjects/gamebooks",
                "/subjects/personal_computer",
                "/subjects/pc",
                "/subjects/playstation_2",
                "/subjects/ps2",
                "/subjects/xbox",
                "/subjects/game_boy_advance",
                "/subjects/gba",
                "/subjects/video_games",
                "/subjects/videogames",
                "/subjects/strategy",
                "/subjects/passtimes",
                "/subjects/hobbies",
                "/subjects/electronic_entertainment",
                "/subjects/video_&_electronic_-_general",
                "/subjects/nintendo_games",
                "/subjects/j.r.r._tolkien",
                "/subjects/adventure",
                "/subjects/role_playing_game",
                "/subjects/rpg",
                "/subjects/the_hobbit",
                "/subjects/hobbit",
                "/subjects/the_lord_of_the_rings",
                "/subjects/lord_of_the_rings",
                "/subjects/the_fellowship_of_the_ring",
                "/subjects/the_two_towers",
                "/subjects/middle-earth",
                "/subjects/computer_games",
                "/subjects/fantasy_games",
                "/subjects/person:j.r.r._tolkien",
                "/subjects/person:john_ronald_reuel_tolkien",
                "/authors/OL1481503A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "subtitle": "The Two Towers",
            "edition_count": 1,
            "edition_key": [
                "OL8018301M"
            ],
            "publish_date": [
                "November 26, 2002"
            ],
            "publish_year": [
                2002
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 96,
            "lccn": [
                "2002114302"
            ],
            "publish_place": [
                "Roseville, CA"
            ],
            "lcc": [
                "GV-1469.35000000.L67 E44 2002",
                "GV-1469.35000000.L67E44"
            ],
            "isbn": [
                "0761541942",
                "9780761541943"
            ],
            "last_modified_i": 1670503734,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofrings00prim"
            ],
            "ia_collection": [
                "china",
                "inlibrary",
                "internetarchivebooks",
                "openlibrary-d-ol",
                "printdisabled"
            ],
            "ia_collection_s": "china;inlibrary;internetarchivebooks;openlibrary-d-ol;printdisabled",
            "lending_edition_s": "OL8018301M",
            "lending_identifier_s": "lordofrings00prim",
            "printdisabled_s": "OL8018301M",
            "readinglog_count": 2,
            "want_to_read_count": 1,
            "currently_reading_count": 0,
            "already_read_count": 1,
            "cover_edition_key": "OL8018301M",
            "cover_i": 8167603,
            "publisher": [
                "Prima Games"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL1481503A"
            ],
            "author_name": [
                "Dan Egger"
            ],
            "person": [
                "J.R.R. Tolkien",
                "John Ronald Reuel Tolkien"
            ],
            "subject": [
                "Lord of the Rings (Game)",
                "Games",
                "Video & Electronic",
                "Gamebooks",
                "Personal Computer",
                "PC",
                "PlayStation 2",
                "PS2",
                "Xbox",
                "Game Boy Advance",
                "GBA",
                "Video games",
                "Videogames",
                "Strategy",
                "Passtimes",
                "Hobbies",
                "Electronic Entertainment",
                "Video & Electronic - General",
                "Nintendo Games",
                "J.R.R. Tolkien",
                "Adventure",
                "Role Playing Game",
                "RPG",
                "The Hobbit",
                "Hobbit",
                "The Lord of the Rings",
                "Lord of the Rings",
                "The Fellowship of the Ring",
                "The Two Towers",
                "Middle-earth",
                "Computer games",
                "Fantasy games"
            ],
            "id_goodreads": [
                "15283"
            ],
            "id_librarything": [
                "2666538"
            ],
            "ia_box_id": [
                "IA139801"
            ],
            "publisher_facet": [
                "Prima Games"
            ],
            "person_key": [
                "j.r.r._tolkien",
                "john_ronald_reuel_tolkien"
            ],
            "person_facet": [
                "J.R.R. Tolkien",
                "John Ronald Reuel Tolkien"
            ],
            "subject_facet": [
                "Adventure",
                "Computer games",
                "Electronic Entertainment",
                "Fantasy games",
                "GBA",
                "Game Boy Advance",
                "Gamebooks",
                "Games",
                "Hobbies",
                "Hobbit",
                "J.R.R. Tolkien",
                "Lord of the Rings",
                "Lord of the Rings (Game)",
                "Middle-earth",
                "Nintendo Games",
                "PC",
                "PS2",
                "Passtimes",
                "Personal Computer",
                "PlayStation 2",
                "RPG",
                "Role Playing Game",
                "Strategy",
                "The Fellowship of the Ring",
                "The Hobbit",
                "The Lord of the Rings",
                "The Two Towers",
                "Video & Electronic",
                "Video & Electronic - General",
                "Video games",
                "Videogames",
                "Xbox"
            ],
            "_version_": 1759801542092783617,
            "lcc_sort": "GV-1469.35000000.L67 E44 2002",
            "author_facet": [
                "OL1481503A Dan Egger"
            ],
            "subject_key": [
                "adventure",
                "computer_games",
                "electronic_entertainment",
                "fantasy_games",
                "game_boy_advance",
                "gamebooks",
                "games",
                "gba",
                "hobbies",
                "hobbit",
                "j.r.r._tolkien",
                "lord_of_the_rings",
                "lord_of_the_rings_(game)",
                "middle-earth",
                "nintendo_games",
                "passtimes",
                "pc",
                "personal_computer",
                "playstation_2",
                "ps2",
                "role_playing_game",
                "rpg",
                "strategy",
                "the_fellowship_of_the_ring",
                "the_hobbit",
                "the_lord_of_the_rings",
                "the_two_towers",
                "video__electronic",
                "video__electronic_-_general",
                "video_games",
                "videogames",
                "xbox"
            ]
        },
        {
            "key": "/works/OL33887017W",
            "type": "work",
            "seed": [
                "/books/OL45871040M",
                "/works/OL33887017W"
            ],
            "title": "THE LORD OF THE RINGS",
            "title_suggest": "THE LORD OF THE RINGS",
            "title_sort": "THE LORD OF THE RINGS",
            "edition_count": 1,
            "edition_key": [
                "OL45871040M"
            ],
            "publish_date": [
                "2003-01-01"
            ],
            "publish_year": [
                2003
            ],
            "first_publish_year": 2003,
            "last_modified_i": 1673750527,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "publisher": [
                "WS"
            ],
            "id_amazon": [
                "B00HNYY0UW"
            ],
            "id_better_world_books": [
                "BWB40997429"
            ],
            "publisher_facet": [
                "WS"
            ],
            "_version_": 1759788723404275713
        },
        {
            "key": "/works/OL33886823W",
            "type": "work",
            "seed": [
                "/books/OL45870841M",
                "/works/OL33886823W",
                "/authors/OL12265059A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL45870841M"
            ],
            "publish_date": [
                "2010-02-10"
            ],
            "publish_year": [
                2010
            ],
            "first_publish_year": 2010,
            "last_modified_i": 1673750498,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "author_key": [
                "OL12265059A"
            ],
            "author_name": [
                "Elijah Wood, Sir Ian McKellen, Liv Tyler, Viggo Mortensen, Sean Astin, Cate Blanchett, John Rhys-Davies, Bernard Hill, Christopher Lee, Billy Boyd"
            ],
            "id_amazon": [
                "B0037WTD5G"
            ],
            "id_better_world_books": [
                "BWB32083792"
            ],
            "_version_": 1759788723896057857,
            "author_facet": [
                "OL12265059A Elijah Wood, Sir Ian McKellen, Liv Tyler, Viggo Mortensen, Sean Astin, Cate Blanchett, John Rhys-Davies, Bernard Hill, Christopher Lee, Billy Boyd"
            ]
        },
        {
            "key": "/works/OL33918153W",
            "type": "work",
            "seed": [
                "/books/OL45904953M",
                "/works/OL33918153W",
                "/authors/OL12275752A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL45904953M"
            ],
            "publish_date": [
                "????"
            ],
            "last_modified_i": 1673763416,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "author_key": [
                "OL12275752A"
            ],
            "author_name": [
                "Elijah Wood, Orlando Bloom, Sean Bean, Alan Howard, Noel Appleby, Sean Astin, Sala Baker, Cate Blanchett, Billy Boyd, Marton Csokas"
            ],
            "id_amazon": [
                "B00005U515"
            ],
            "id_better_world_books": [
                "BWB40645319"
            ],
            "_version_": 1759788902617448449,
            "author_facet": [
                "OL12275752A Elijah Wood, Orlando Bloom, Sean Bean, Alan Howard, Noel Appleby, Sean Astin, Sala Baker, Cate Blanchett, Billy Boyd, Marton Csokas"
            ]
        },
        {
            "key": "/works/OL4245244W",
            "type": "work",
            "seed": [
                "/books/OL3698865M",
                "/works/OL4245244W",
                "/subjects/video_games",
                "/authors/OL816088A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL3698865M"
            ],
            "publish_date": [
                "2004"
            ],
            "publish_year": [
                2004
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 240,
            "lccn": [
                "2003114104"
            ],
            "publish_place": [
                "Indianapolis, IN"
            ],
            "oclc": [
                "54982741"
            ],
            "isbn": [
                "0744003490",
                "9780744003499"
            ],
            "last_modified_i": 1607403940,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL3698865M",
            "cover_i": 481574,
            "publisher": [
                "BradyGames"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL816088A"
            ],
            "author_name": [
                "Cohen, Mark"
            ],
            "subject": [
                "Video games"
            ],
            "id_goodreads": [
                "15285"
            ],
            "id_librarything": [
                "1260796"
            ],
            "publisher_facet": [
                "BradyGames"
            ],
            "subject_facet": [
                "Video games"
            ],
            "_version_": 1759792373206876161,
            "author_facet": [
                "OL816088A Cohen, Mark"
            ],
            "subject_key": [
                "video_games"
            ]
        },
        {
            "key": "/works/OL5742945W",
            "type": "work",
            "seed": [
                "/books/OL8018441M",
                "/works/OL5742945W",
                "/subjects/video_games",
                "/subjects/electronic_games",
                "/authors/OL1396492A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL8018441M"
            ],
            "publish_date": [
                "December 14, 2004"
            ],
            "publish_year": [
                2004
            ],
            "first_publish_year": 2004,
            "number_of_pages_median": 224,
            "lccn": [
                "2004109801"
            ],
            "isbn": [
                "9780761545453",
                "076154545X"
            ],
            "last_modified_i": 1631800845,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL8018441M",
            "cover_i": 510809,
            "publisher": [
                "Prima Games"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL1396492A"
            ],
            "author_name": [
                "Bryan Stratton"
            ],
            "subject": [
                "Video games",
                "Electronic games"
            ],
            "id_goodreads": [
                "92006"
            ],
            "id_librarything": [
                "3030910"
            ],
            "publisher_facet": [
                "Prima Games"
            ],
            "subject_facet": [
                "Electronic games",
                "Video games"
            ],
            "_version_": 1759795448358371328,
            "author_facet": [
                "OL1396492A Bryan Stratton"
            ],
            "subject_key": [
                "electronic_games",
                "video_games"
            ]
        },
        {
            "key": "/works/OL20324134W",
            "type": "work",
            "seed": [
                "/books/OL27530098M",
                "/works/OL20324134W",
                "/authors/OL3207285A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL27530098M"
            ],
            "publish_date": [
                "Jul 15, 2014"
            ],
            "publish_year": [
                2014
            ],
            "first_publish_year": 2014,
            "number_of_pages_median": 40,
            "isbn": [
                "9781608873821",
                "160887382X"
            ],
            "last_modified_i": 1632909588,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL27530098M",
            "cover_i": 8986062,
            "publisher": [
                "Insights"
            ],
            "author_key": [
                "OL3207285A"
            ],
            "author_name": [
                "New Line Cinema"
            ],
            "id_amazon": [
                "160887382X"
            ],
            "publisher_facet": [
                "Insights"
            ],
            "_version_": 1759762049705967617,
            "author_facet": [
                "OL3207285A New Line Cinema"
            ]
        },
        {
            "key": "/works/OL18146933W",
            "type": "work",
            "seed": [
                "/books/OL20098346M",
                "/works/OL18146933W",
                "/authors/OL7442781A",
                "/authors/OL6238590A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL20098346M"
            ],
            "publish_date": [
                "1979"
            ],
            "publish_year": [
                1979
            ],
            "first_publish_year": 1979,
            "publish_place": [
                "Los Angeles"
            ],
            "last_modified_i": 1546453849,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "readinglog_count": 2,
            "want_to_read_count": 2,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "publisher": [
                "Fotonovel Publications"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL7442781A",
                "OL6238590A"
            ],
            "author_name": [
                "Chris Conkling",
                "Peter S. Beagle"
            ],
            "author_alternative_name": [
                "Peter Beagle",
                "Peter S Beagle",
                "P. S. Beagle",
                "Peter Soyer Beagle"
            ],
            "publisher_facet": [
                "Fotonovel Publications"
            ],
            "_version_": 1759756834352136193,
            "author_facet": [
                "OL6238590A Peter S. Beagle",
                "OL7442781A Chris Conkling"
            ]
        },
        {
            "key": "/works/OL20196494W",
            "type": "work",
            "seed": [
                "/books/OL27383384M",
                "/works/OL20196494W",
                "/authors/OL7653351A"
            ],
            "title": "The Rings Of The Lords",
            "title_suggest": "The Rings Of The Lords",
            "title_sort": "The Rings Of The Lords",
            "edition_count": 1,
            "edition_key": [
                "OL27383384M"
            ],
            "publish_date": [
                "Apr 20, 2017"
            ],
            "publish_year": [
                2017
            ],
            "first_publish_year": 2017,
            "number_of_pages_median": 501,
            "isbn": [
                "1520881339",
                "9781520881331"
            ],
            "last_modified_i": 1669050563,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL27383384M",
            "cover_i": 8846255,
            "publisher": [
                "Independently published"
            ],
            "author_key": [
                "OL7653351A"
            ],
            "author_name": [
                "Liam Simon Blades"
            ],
            "id_amazon": [
                "1520881339"
            ],
            "publisher_facet": [
                "Independently published"
            ],
            "_version_": 1759761811984351234,
            "author_facet": [
                "OL7653351A Liam Simon Blades"
            ]
        },
        {
            "key": "/works/OL21184809W",
            "type": "work",
            "seed": [
                "/books/OL7262233M",
                "/works/OL21184809W",
                "/subjects/lord_of_the_rings:_the_two_towers_(motion_picture)",
                "/subjects/two_towers_(tolkien_j.r.r.)",
                "/subjects/lord_of_the_rings_the_two_towers_(motion_picture)",
                "/subjects/film_adaptations",
                "/subjects/person:j._r._r._tolkien_(1892-1973)",
                "/authors/OL6382265A"
            ],
            "title": "The Lord of the rings",
            "title_suggest": "The Lord of the rings",
            "title_sort": "The Lord of the rings",
            "edition_count": 1,
            "edition_key": [
                "OL7262233M"
            ],
            "number_of_pages_median": 48,
            "isbn": [
                "9780007143726",
                "0007143729"
            ],
            "last_modified_i": 1597296165,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringstwoto0000braw"
            ],
            "ia_collection": [
                "inlibrary",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "inlibrary;internetarchivebooks;printdisabled",
            "lending_edition_s": "OL7262233M",
            "lending_identifier_s": "lordofringstwoto0000braw",
            "printdisabled_s": "OL7262233M",
            "readinglog_count": 2,
            "want_to_read_count": 2,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL7262233M",
            "cover_i": 10417,
            "author_key": [
                "OL6382265A"
            ],
            "author_name": [
                "David Brawn"
            ],
            "person": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject": [
                "Lord of the Rings: The two towers (Motion picture)",
                "Two towers (Tolkien, J.R.R.)",
                "Lord of the rings, the two towers (Motion picture)",
                "Film adaptations"
            ],
            "id_goodreads": [
                "1092795"
            ],
            "id_librarything": [
                "26037"
            ],
            "ia_box_id": [
                "IA1891024"
            ],
            "person_key": [
                "j._r._r._tolkien_(1892-1973)"
            ],
            "person_facet": [
                "J. R. R. Tolkien (1892-1973)"
            ],
            "subject_facet": [
                "Film adaptations",
                "Lord of the Rings: The two towers (Motion picture)",
                "Lord of the rings, the two towers (Motion picture)",
                "Two towers (Tolkien, J.R.R.)"
            ],
            "_version_": 1759764091497349121,
            "author_facet": [
                "OL6382265A David Brawn"
            ],
            "subject_key": [
                "film_adaptations",
                "lord_of_the_rings_the_two_towers_(motion_picture)",
                "two_towers_(tolkien_j.r.r.)"
            ]
        },
        {
            "key": "/works/OL24532603W",
            "type": "work",
            "seed": [
                "/books/OL32516687M",
                "/works/OL24532603W",
                "/authors/OL9242128A"
            ],
            "title": "The Rings Of The Lords",
            "title_suggest": "The Rings Of The Lords",
            "title_sort": "The Rings Of The Lords",
            "edition_count": 1,
            "edition_key": [
                "OL32516687M"
            ],
            "publish_date": [
                "Jan 07, 2019"
            ],
            "publish_year": [
                2019
            ],
            "first_publish_year": 2019,
            "number_of_pages_median": 502,
            "isbn": [
                "024443624X",
                "9780244436247"
            ],
            "last_modified_i": 1666171176,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL32516687M",
            "cover_i": 11167327,
            "publisher": [
                "lulu.com",
                "Lulu.com"
            ],
            "author_key": [
                "OL9242128A"
            ],
            "author_name": [
                "Liam Blades"
            ],
            "publisher_facet": [
                "Lulu.com",
                "lulu.com"
            ],
            "_version_": 1759770502950289408,
            "author_facet": [
                "OL9242128A Liam Blades"
            ]
        },
        {
            "key": "/works/OL24419503W",
            "type": "work",
            "seed": [
                "/books/OL32344966M",
                "/works/OL24419503W",
                "/authors/OL8614601A"
            ],
            "title": "The lord of the rings",
            "title_suggest": "The lord of the rings",
            "title_sort": "The lord of the rings",
            "edition_count": 1,
            "edition_key": [
                "OL32344966M"
            ],
            "publish_date": [
                "2003"
            ],
            "publish_year": [
                2003
            ],
            "first_publish_year": 2003,
            "number_of_pages_median": 119,
            "publish_place": [
                "Amsterdam"
            ],
            "oclc": [
                "66791537"
            ],
            "contributor": [
                "Kuipers, Hugo, 1954-2013",
                "Russell, Gary"
            ],
            "isbn": [
                "9022537757",
                "9789022537756"
            ],
            "last_modified_i": 1673776576,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringsgolle0000serk"
            ],
            "ia_collection": [
                "inlibrary",
                "internetarchivebooks",
                "printdisabled"
            ],
            "ia_collection_s": "inlibrary;internetarchivebooks;printdisabled",
            "lending_edition_s": "OL32344966M",
            "lending_identifier_s": "lordofringsgolle0000serk",
            "printdisabled_s": "OL32344966M",
            "cover_edition_key": "OL32344966M",
            "cover_i": 10967837,
            "publisher": [
                "Uitgeverij M"
            ],
            "language": [
                "dut"
            ],
            "author_key": [
                "OL8614601A"
            ],
            "author_name": [
                "Andy Serkis"
            ],
            "ia_box_id": [
                "IA40096116"
            ],
            "publisher_facet": [
                "Uitgeverij M"
            ],
            "_version_": 1759770154587127809,
            "author_facet": [
                "OL8614601A Andy Serkis"
            ]
        },
        {
            "key": "/works/OL15145356W",
            "type": "work",
            "seed": [
                "/books/OL24212888M",
                "/works/OL15145356W",
                "/subjects/lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "/subjects/motion_pictures",
                "/subjects/motion_picture_plays",
                "/subjects/motion_pictures_juvenile_literature",
                "/authors/OL475982A"
            ],
            "title": "The Lord of the rings",
            "title_suggest": "The Lord of the rings",
            "title_sort": "The Lord of the rings",
            "subtitle": "the fellowship of the ring ; insiders' guide",
            "edition_count": 1,
            "edition_key": [
                "OL24212888M"
            ],
            "publish_date": [
                "2001"
            ],
            "publish_year": [
                2001
            ],
            "first_publish_year": 2001,
            "number_of_pages_median": 96,
            "publish_place": [
                "London"
            ],
            "oclc": [
                "50526330"
            ],
            "ddc": [
                "791.4372"
            ],
            "isbn": [
                "9780007131945",
                "0007131941"
            ],
            "last_modified_i": 1671245553,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringsfello00siblrich"
            ],
            "ia_collection": [
                "americana",
                "inlibrary",
                "internetarchivebooks",
                "openlibrary-d-ol",
                "printdisabled"
            ],
            "ia_collection_s": "americana;inlibrary;internetarchivebooks;openlibrary-d-ol;printdisabled",
            "lending_edition_s": "OL24212888M",
            "lending_identifier_s": "lordofringsfello00siblrich",
            "printdisabled_s": "OL24212888M",
            "readinglog_count": 4,
            "want_to_read_count": 2,
            "currently_reading_count": 0,
            "already_read_count": 2,
            "cover_edition_key": "OL24212888M",
            "cover_i": 6532865,
            "publisher": [
                "Collins"
            ],
            "author_key": [
                "OL475982A"
            ],
            "author_name": [
                "Brian Sibley"
            ],
            "author_alternative_name": [
                "Brian David Sibley"
            ],
            "subject": [
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Motion pictures",
                "Motion picture plays",
                "Motion pictures, juvenile literature"
            ],
            "ia_box_id": [
                "IA105508"
            ],
            "publisher_facet": [
                "Collins"
            ],
            "subject_facet": [
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Motion picture plays",
                "Motion pictures",
                "Motion pictures, juvenile literature"
            ],
            "_version_": 1759750646950526977,
            "author_facet": [
                "OL475982A Brian Sibley"
            ],
            "subject_key": [
                "lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "motion_picture_plays",
                "motion_pictures",
                "motion_pictures_juvenile_literature"
            ],
            "ddc_sort": "791.4372"
        },
        {
            "key": "/works/OL17863428W",
            "type": "work",
            "seed": [
                "/books/OL8018275M",
                "/works/OL17863428W",
                "/subjects/video_&_electronic_-_nintendo",
                "/subjects/video_&_electronic_-_general",
                "/subjects/games",
                "/subjects/computers_-_games",
                "/subjects/computer_books:_general",
                "/subjects/games/puzzles",
                "/subjects/video_&_electronic_-_sony_playstation_2",
                "/subjects/video_&_electronic_-_microsoft_xbox",
                "/subjects/entertainment_&_games_-_general",
                "/subjects/computer_games",
                "/subjects/games_/_video_&_electronic",
                "/subjects/lord_of_the_rings_(game)",
                "/subjects/video_&_electronic",
                "/subjects/gamebooks",
                "/subjects/personal_computer",
                "/subjects/pc",
                "/subjects/playstation_2",
                "/subjects/ps2",
                "/subjects/xbox",
                "/subjects/game_boy_advance",
                "/subjects/gba",
                "/subjects/video_games",
                "/subjects/videogames",
                "/subjects/strategy",
                "/subjects/passtimes",
                "/subjects/hobbies",
                "/subjects/electronic_entertainment",
                "/subjects/nintendo_games",
                "/subjects/j.r.r._tolkien",
                "/subjects/adventure",
                "/subjects/role_playing_game",
                "/subjects/rpg",
                "/subjects/the_hobbit",
                "/subjects/hobbit",
                "/subjects/the_lord_of_the_rings",
                "/subjects/lord_of_the_rings",
                "/subjects/the_fellowship_of_the_ring",
                "/subjects/fellowship_of_the_ring",
                "/subjects/middle-earth",
                "/subjects/fantasy_games",
                "/subjects/person:j.r.r._tolkien",
                "/subjects/person:john_ronald_reuel_tolkien",
                "/authors/OL2821360A",
                "/authors/OL1605109A",
                "/authors/OL244984A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "subtitle": "The Fellowship of the Ring",
            "edition_count": 1,
            "edition_key": [
                "OL8018275M"
            ],
            "publish_date": [
                "October 29, 2002"
            ],
            "publish_year": [
                2002
            ],
            "first_publish_year": 2002,
            "number_of_pages_median": 208,
            "lccn": [
                "2002112905"
            ],
            "publish_place": [
                "Roseville, CA"
            ],
            "oclc": [
                "51565698"
            ],
            "lcc": [
                "GV-1469.35000000.L67 C37 2002",
                "GV-1469.35000000.L67C37"
            ],
            "isbn": [
                "0761540873",
                "9780761540878"
            ],
            "last_modified_i": 1632877344,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL8018275M",
            "cover_i": 8167590,
            "publisher": [
                "Prima Games"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL2821360A",
                "OL1605109A",
                "OL244984A"
            ],
            "author_name": [
                "Mark Cohen",
                "Debra McBride",
                "David Cassady"
            ],
            "author_alternative_name": [
                "Debra Mcbride"
            ],
            "person": [
                "J.R.R. Tolkien",
                "John Ronald Reuel Tolkien"
            ],
            "subject": [
                "Video & Electronic - Nintendo",
                "Video & Electronic - General",
                "Games",
                "Computers - Games",
                "Computer Books: General",
                "Games/Puzzles",
                "Video & Electronic - Sony PlayStation 2",
                "Video & Electronic - Microsoft Xbox",
                "Entertainment & Games - General",
                "Computer games",
                "Games / Video & Electronic",
                "Lord of the Rings (Game)",
                "Video & Electronic",
                "Gamebooks",
                "Personal Computer",
                "PC",
                "PlayStation 2",
                "PS2",
                "Xbox",
                "Game Boy Advance",
                "GBA",
                "Video games",
                "Videogames",
                "Strategy",
                "Passtimes",
                "Hobbies",
                "Electronic Entertainment",
                "Nintendo Games",
                "J.R.R. Tolkien",
                "Adventure",
                "Role Playing Game",
                "RPG",
                "The Hobbit",
                "Hobbit",
                "The Lord of the Rings",
                "Lord of the Rings",
                "The Fellowship of the Ring",
                "Fellowship of the Ring",
                "Middle-earth",
                "Fantasy games"
            ],
            "id_goodreads": [
                "15257"
            ],
            "id_librarything": [
                "1198541"
            ],
            "publisher_facet": [
                "Prima Games"
            ],
            "person_key": [
                "j.r.r._tolkien",
                "john_ronald_reuel_tolkien"
            ],
            "person_facet": [
                "J.R.R. Tolkien",
                "John Ronald Reuel Tolkien"
            ],
            "subject_facet": [
                "Adventure",
                "Computer Books: General",
                "Computer games",
                "Computers - Games",
                "Electronic Entertainment",
                "Entertainment & Games - General",
                "Fantasy games",
                "Fellowship of the Ring",
                "GBA",
                "Game Boy Advance",
                "Gamebooks",
                "Games",
                "Games / Video & Electronic",
                "Games/Puzzles",
                "Hobbies",
                "Hobbit",
                "J.R.R. Tolkien",
                "Lord of the Rings",
                "Lord of the Rings (Game)",
                "Middle-earth",
                "Nintendo Games",
                "PC",
                "PS2",
                "Passtimes",
                "Personal Computer",
                "PlayStation 2",
                "RPG",
                "Role Playing Game",
                "Strategy",
                "The Fellowship of the Ring",
                "The Hobbit",
                "The Lord of the Rings",
                "Video & Electronic",
                "Video & Electronic - General",
                "Video & Electronic - Microsoft Xbox",
                "Video & Electronic - Nintendo",
                "Video & Electronic - Sony PlayStation 2",
                "Video games",
                "Videogames",
                "Xbox"
            ],
            "_version_": 1759756441099436032,
            "lcc_sort": "GV-1469.35000000.L67 C37 2002",
            "author_facet": [
                "OL1605109A Debra McBride",
                "OL244984A David Cassady",
                "OL2821360A Mark Cohen"
            ],
            "subject_key": [
                "adventure",
                "computer_books_general",
                "computer_games",
                "computers_-_games",
                "electronic_entertainment",
                "entertainment__games_-_general",
                "fantasy_games",
                "fellowship_of_the_ring",
                "game_boy_advance",
                "gamebooks",
                "games",
                "games__video__electronic",
                "gamespuzzles",
                "gba",
                "hobbies",
                "hobbit",
                "j.r.r._tolkien",
                "lord_of_the_rings",
                "lord_of_the_rings_(game)",
                "middle-earth",
                "nintendo_games",
                "passtimes",
                "pc",
                "personal_computer",
                "playstation_2",
                "ps2",
                "role_playing_game",
                "rpg",
                "strategy",
                "the_fellowship_of_the_ring",
                "the_hobbit",
                "the_lord_of_the_rings",
                "video__electronic",
                "video__electronic_-_general",
                "video__electronic_-_microsoft_xbox",
                "video__electronic_-_nintendo",
                "video__electronic_-_sony_playstation_2",
                "video_games",
                "videogames",
                "xbox"
            ]
        },
        {
            "key": "/works/OL17863437W",
            "type": "work",
            "seed": [
                "/books/OL3698160M",
                "/works/OL17863437W",
                "/subjects/lord_of_the_rings_(game)",
                "/subjects/games",
                "/subjects/video_&_electronic",
                "/subjects/gamebooks",
                "/subjects/personal_computer",
                "/subjects/pc",
                "/subjects/playstation_2",
                "/subjects/ps2",
                "/subjects/xbox",
                "/subjects/game_boy_advance",
                "/subjects/gba",
                "/subjects/video_games",
                "/subjects/videogames",
                "/subjects/strategy",
                "/subjects/passtimes",
                "/subjects/hobbies",
                "/subjects/electronic_entertainment",
                "/subjects/video_&_electronic_-_general",
                "/subjects/nintendo_games",
                "/subjects/j.r.r._tolkien",
                "/subjects/adventure",
                "/subjects/role_playing_game",
                "/subjects/rpg",
                "/subjects/the_hobbit",
                "/subjects/hobbit",
                "/subjects/the_lord_of_the_rings",
                "/subjects/lord_of_the_rings",
                "/subjects/the_return_of_the_king",
                "/subjects/middle-earth",
                "/subjects/person:j.r.r._tolkien",
                "/subjects/person:john_ronald_reuel_tolkien",
                "/authors/OL93017A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "subtitle": "Return of the King",
            "edition_count": 1,
            "edition_key": [
                "OL3698160M"
            ],
            "publish_date": [
                "2003"
            ],
            "publish_year": [
                2003
            ],
            "first_publish_year": 2003,
            "number_of_pages_median": 96,
            "lccn": [
                "2003111140"
            ],
            "publish_place": [
                "Roseville, CA"
            ],
            "isbn": [
                "9780761543947",
                "0761543945"
            ],
            "last_modified_i": 1673754639,
            "ebook_count_i": 0,
            "ebook_access": "no_ebook",
            "has_fulltext": false,
            "public_scan_b": false,
            "cover_edition_key": "OL3698160M",
            "cover_i": 8167609,
            "publisher": [
                "Prima Games"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL93017A"
            ],
            "author_name": [
                "Mario De Govia"
            ],
            "person": [
                "J.R.R. Tolkien",
                "John Ronald Reuel Tolkien"
            ],
            "subject": [
                "Lord of the Rings (Game)",
                "Games",
                "Video & Electronic",
                "Gamebooks",
                "Personal Computer",
                "PC",
                "PlayStation 2",
                "PS2",
                "Xbox",
                "Game Boy Advance",
                "GBA",
                "Video games",
                "Videogames",
                "Strategy",
                "Passtimes",
                "Hobbies",
                "Electronic Entertainment",
                "Video & Electronic - General",
                "Nintendo Games",
                "J.R.R. Tolkien",
                "Adventure",
                "Role Playing Game",
                "RPG",
                "The Hobbit",
                "Hobbit",
                "The Lord of the Rings",
                "Lord of the Rings",
                "The Return of the King",
                "Middle-earth"
            ],
            "id_goodreads": [
                "15258"
            ],
            "id_librarything": [
                "2460463"
            ],
            "publisher_facet": [
                "Prima Games"
            ],
            "person_key": [
                "j.r.r._tolkien",
                "john_ronald_reuel_tolkien"
            ],
            "person_facet": [
                "J.R.R. Tolkien",
                "John Ronald Reuel Tolkien"
            ],
            "subject_facet": [
                "Adventure",
                "Electronic Entertainment",
                "GBA",
                "Game Boy Advance",
                "Gamebooks",
                "Games",
                "Hobbies",
                "Hobbit",
                "J.R.R. Tolkien",
                "Lord of the Rings",
                "Lord of the Rings (Game)",
                "Middle-earth",
                "Nintendo Games",
                "PC",
                "PS2",
                "Passtimes",
                "Personal Computer",
                "PlayStation 2",
                "RPG",
                "Role Playing Game",
                "Strategy",
                "The Hobbit",
                "The Lord of the Rings",
                "The Return of the King",
                "Video & Electronic",
                "Video & Electronic - General",
                "Video games",
                "Videogames",
                "Xbox"
            ],
            "_version_": 1759756441738018817,
            "author_facet": [
                "OL93017A Mario De Govia"
            ],
            "subject_key": [
                "adventure",
                "electronic_entertainment",
                "game_boy_advance",
                "gamebooks",
                "games",
                "gba",
                "hobbies",
                "hobbit",
                "j.r.r._tolkien",
                "lord_of_the_rings",
                "lord_of_the_rings_(game)",
                "middle-earth",
                "nintendo_games",
                "passtimes",
                "pc",
                "personal_computer",
                "playstation_2",
                "ps2",
                "role_playing_game",
                "rpg",
                "strategy",
                "the_hobbit",
                "the_lord_of_the_rings",
                "the_return_of_the_king",
                "video__electronic",
                "video__electronic_-_general",
                "video_games",
                "videogames",
                "xbox"
            ]
        },
        {
            "key": "/works/OL18414703W",
            "type": "work",
            "seed": [
                "/books/OL21632135M",
                "/works/OL18414703W",
                "/subjects/motion_pictures",
                "/subjects/lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "/subjects/social_aspects",
                "/subjects/popular_culture",
                "/subjects/lord_of_the_rings_the_two_towers_(motion_picture)",
                "/subjects/lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "/subjects/motion_picture_industry",
                "/subjects/economic_aspects",
                "/subjects/motion_pictures_social_aspects",
                "/subjects/in_motion_pictures",
                "/subjects/the_lord_of_the_rings_(tolkien)",
                "/subjects/films",
                "/subjects/populaire_cultuur",
                "/subjects/merchandising",
                "/subjects/lord_of_the_rings_the_fellowship_of_the_ring._(motion_picture_:_2001)",
                "/subjects/lord_of_the_rings_the_two_towers._(motion_picture_:_2002)",
                "/subjects/lord_of_the_rings_the_return_of_the_king._(motion_picture_:_2003)",
                "/subjects/lord_of_the_rings",
                "/authors/OL3091153A"
            ],
            "title": "The Lord of the Rings",
            "title_suggest": "The Lord of the Rings",
            "title_sort": "The Lord of the Rings",
            "edition_count": 1,
            "edition_key": [
                "OL21632135M"
            ],
            "publish_date": [
                "2006"
            ],
            "publish_year": [
                2006
            ],
            "first_publish_year": 2006,
            "number_of_pages_median": 341,
            "publish_place": [
                "New York",
                "London"
            ],
            "oclc": [
                "64098191"
            ],
            "contributor": [
                "Mathijs, Ernest."
            ],
            "lcc": [
                "PN-1995.90000000.L58",
                "PN-1995.90000000.L58 L67 2006"
            ],
            "ddc": [
                "791.4375"
            ],
            "isbn": [
                "1904764827",
                "1904764835",
                "9781904764823",
                "9781904764830"
            ],
            "last_modified_i": 1678150626,
            "ebook_count_i": 1,
            "ebook_access": "borrowable",
            "has_fulltext": true,
            "public_scan_b": false,
            "ia": [
                "lordofringspopul0000unse"
            ],
            "ia_collection": [
                "belmont-ol",
                "gwulibraries-ol",
                "inlibrary",
                "internetarchivebooks",
                "ithacacollege-ol",
                "johnshopkins-ol",
                "printdisabled",
                "riceuniversity-ol",
                "rochester-ol",
                "the-claremont-colleges-ol",
                "uni-ol",
                "universityofarizona-ol",
                "universityofcoloradoboulder-ol",
                "universityofoklahoma-ol"
            ],
            "ia_collection_s": "belmont-ol;gwulibraries-ol;inlibrary;internetarchivebooks;ithacacollege-ol;johnshopkins-ol;printdisabled;riceuniversity-ol;rochester-ol;the-claremont-colleges-ol;uni-ol;universityofarizona-ol;universityofcoloradoboulder-ol;universityofoklahoma-ol",
            "lending_edition_s": "OL21632135M",
            "lending_identifier_s": "lordofringspopul0000unse",
            "printdisabled_s": "OL21632135M",
            "readinglog_count": 0,
            "want_to_read_count": 0,
            "currently_reading_count": 0,
            "already_read_count": 0,
            "cover_edition_key": "OL21632135M",
            "cover_i": 12590290,
            "publisher": [
                "Wallflower",
                "Wallflower Press"
            ],
            "language": [
                "eng"
            ],
            "author_key": [
                "OL3091153A"
            ],
            "author_name": [
                "Ernest Mathijs"
            ],
            "subject": [
                "Motion pictures",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Social aspects",
                "Popular culture",
                "Lord of the rings, the two towers (Motion picture)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Motion picture industry",
                "Economic aspects",
                "Motion pictures, social aspects",
                "In motion pictures",
                "The lord of the rings (Tolkien)",
                "Films",
                "Populaire cultuur",
                "Merchandising",
                "Lord of the rings, the fellowship of the ring. (Motion picture : 2001)",
                "Lord of the rings, the two towers. (Motion picture : 2002)",
                "Lord of the rings, the return of the king. (Motion picture : 2003)",
                "Lord of the rings"
            ],
            "id_goodreads": [
                "222930",
                "1982337"
            ],
            "id_librarything": [
                "3706961"
            ],
            "ia_box_id": [
                "IA40327420"
            ],
            "publisher_facet": [
                "Wallflower",
                "Wallflower Press"
            ],
            "subject_facet": [
                "Economic aspects",
                "Films",
                "In motion pictures",
                "Lord of the rings",
                "Lord of the rings, the fellowship of the ring (Motion picture)",
                "Lord of the rings, the fellowship of the ring. (Motion picture : 2001)",
                "Lord of the rings, the return of the king (Motion picture)",
                "Lord of the rings, the return of the king. (Motion picture : 2003)",
                "Lord of the rings, the two towers (Motion picture)",
                "Lord of the rings, the two towers. (Motion picture : 2002)",
                "Merchandising",
                "Motion picture industry",
                "Motion pictures",
                "Motion pictures, social aspects",
                "Populaire cultuur",
                "Popular culture",
                "Social aspects",
                "The lord of the rings (Tolkien)"
            ],
            "_version_": 1759900449780006913,
            "lcc_sort": "PN-1995.90000000.L58 L67 2006",
            "author_facet": [
                "OL3091153A Ernest Mathijs"
            ],
            "subject_key": [
                "economic_aspects",
                "films",
                "in_motion_pictures",
                "lord_of_the_rings",
                "lord_of_the_rings_the_fellowship_of_the_ring._(motion_picture__2001)",
                "lord_of_the_rings_the_fellowship_of_the_ring_(motion_picture)",
                "lord_of_the_rings_the_return_of_the_king._(motion_picture__2003)",
                "lord_of_the_rings_the_return_of_the_king_(motion_picture)",
                "lord_of_the_rings_the_two_towers._(motion_picture__2002)",
                "lord_of_the_rings_the_two_towers_(motion_picture)",
                "merchandising",
                "motion_picture_industry",
                "motion_pictures",
                "motion_pictures_social_aspects",
                "populaire_cultuur",
                "popular_culture",
                "social_aspects",
                "the_lord_of_the_rings_(tolkien)"
            ],
            "ddc_sort": "791.4375"
        }
    ],
    "num_found": 473,
    "q": "",
    "offset": null
}"""
