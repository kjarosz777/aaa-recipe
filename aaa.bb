inherit cmake

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

FILESEXTRAPATHS:append := ":/home/kjarosz/projects/"

S = "${WORKDIR}"

SRC_URI = "file://aaa.tar.gz"

#do_install () {
#	install -d ${D}${sysconfdir}/init.d
#	install -m 0755    ${WORKDIR}/aaa_run.sh	${D}${sysconfdir}/init.d/
#}