inherit module

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "git://github.com/kjarosz777/aaa-kernel;protocol=https;branch=master"
# SRC_URI = "git:///home/kjarosz/projects/aaa-kernel/;protocol=file;branch=kernel_test2"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
