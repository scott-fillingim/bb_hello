DESCRIPTION = "Prints Hello World"
PN = 'printhello'
PV = '1'

python do_build() {
   bb.plain("********************");
   bb.plain("*                  *");
   bb.plain("*  Hello, World!   *");
   bb.plain("*                  *");
   bb.plain("*    DATE:         *");
   bb.plain("*                  *");
   bb.plain("********************");
}

python do_clean() {
   bb.plain("");
   bb.plain("********************");
   bb.plain("Complete");
   bb.plain("********************");
   bb.plain("");
}

python do_install() {
   bb.plain("HERE");
}
