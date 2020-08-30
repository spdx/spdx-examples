/* SPDX-License-Identifier: GPL-3.0-or-later */

#include <stdio.h>
#include <stdlib.h>
#include <dlfcn.h>

/* Thank you to David A. Wheeler for the Program Library HOWTO at
 * https://tldp.org/HOWTO/Program-Library-HOWTO/ for a reminder of
 * how to use dlopen()  :)
 */

int main(int argc, const char *argv[]) {
	void *h;
	int (*addfive)(int);
	char *error;
	int retval;

	h = dlopen("./lib.so", RTLD_NOW);
	if (!h) {
		fputs(dlerror(), stderr);
		exit(1);
	}

	addfive = dlsym(h, "addfive");
	error = dlerror();
	if (error != NULL) {
		fputs(error, stderr);
		exit(1);
	}

	retval = (*addfive)(4);
	dlclose(h);

	printf("addfive(4) is %d\n", retval);
	return 0;
}

