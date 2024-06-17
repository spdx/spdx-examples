# SPDX-License-Identifier: GPL-3.0-or-later

example3: main.c lib.c
	gcc -shared -rdynamic -o ../build/lib.so lib.c
	gcc -o ../build/main main.c -ldl

.PHONY: clean

clean:
	rm -f ../build/lib.so
	rm -f ../build/main

