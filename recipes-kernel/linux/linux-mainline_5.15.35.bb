require linux-mainline.inc

DESCRIPTION = "Mainline Longterm Linux kernel"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI[sha256sum] = "0a1a5ae2f30eb2b38215e59077f045aabd7f4e2857a881482f02ea48186105d8"

SRC_URI:append:orange-pi-zero2sun50i = " file://0001-dts-add-h616-and-orangepizero2.patch"

